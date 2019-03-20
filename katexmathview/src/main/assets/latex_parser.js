(function(){

  window.onload = function(){
//  console.log('juery',$);
    //setTimeout(function(){
     var latexElement  = $('body').find('.latexEle');
     console.log(latexElement.length);
     for (var j = 0; j < latexElement.length; j++) {
             var latex = $(latexElement[j]).attr('data-latex');
             console.log(latex);
             var splittedLatex = splitLatex(latex);
             console.log('splittedLatex',splittedLatex);
              if (splittedLatex.length > 1) {
                $(latexElement[j]).removeClass('latexEle');
                $(latexElement[j]).removeAttr('data-latex');
                latexElement[j].innerHTML = '';
                for (var k = 0; k < splittedLatex.length; k++) {
                  var latexItem = splittedLatex[k];
                  if (latexItem) {
                    var temp = $('<span class="latexEle" contenteditable="false"></span>');
                    $(latexElement[j]).append($('<p></p>').append(temp));
                    temp.attr('data-latex', latexItem);
                    temp.text('$'+latexItem+'$');
                  }
                }
              } else {
                $(latexElement[j]).text('$'+splittedLatex[0]+'$');
              }
            }
             renderMathInElement(document.body);
   // },500)

  }

})();

var splitLatex = function (latex) {
    // handling line breaks
    // katex does not support line breaks so need to split the latex into multiple formulaes based on line breaks
    // need to support matrix environment
    // line breaks are supported in environments so need to skip handling line breaks for closed environment
    // handling brackets if matrix is wrapped in brackets need to handle the scenario

    var matches = [];

    function globalMatch(regex) {
      return new RegExp(regex.source, 'g');
    }

    // matches the pattern \begin{matrix}any-valid-char\end{matrix}
    var environmentMatch = new RegExp(/(\\begin{(\w*)}(.*?)(\\end){(\2)})/);
    var bracketMatch = new RegExp(/(\\left[\[\(\{\|])(.*?)(\\right[\]\}\)\|])/);
    var positionMatch = new RegExp(/(\$[\d]*\$)/);
    var match = latex.match(environmentMatch);
    // prevent infinite loop in remote scenario
    var iteration = 0;

    while (match && iteration < 10) {
      matches.push(match[0]);
      latex = latex.replace(match[0], '$' + (matches.length - 1) + '$');
      match = latex.match(environmentMatch);
      iteration++;
    }

    iteration = 0;

    match = latex.match(bracketMatch);
    while (match && iteration < 10) {
      matches.push(match[0]);
      latex = latex.replace(match[0], '$' + (matches.length - 1) + '$');
      match = latex.match(bracketMatch);
      iteration++;
    }


    var splittedLatex = latex.split('\\\\');
    // filter empty strings
    splittedLatex = splittedLatex.filter(function (item) {
      return item.length;
    });

    splittedLatex = splittedLatex.map(function (item, index) {
      var pos = item.match(positionMatch);
      var iteration = 0;
      while (iteration < 10 && pos) {
        index = Number(pos[0].substring(1, pos[0].length - 1));
        item = item.replace(pos[0], matches[index]);
        pos = item.match(positionMatch);
        iteration++;
      }
      return item;
    });


    var tempArray = [];
    for (var a = 0; a < splittedLatex.length; a++) {
      if (splittedLatex[a].match(environmentMatch) || splittedLatex[a].match(bracketMatch)) {
        tempArray.push(splittedLatex[a]);
      } else {
        var temp = splittedLatex[a].split(/\\\\/).map(function (item) {
          return item.trim();
        }).filter(function (item) {
          return item.length;
        });
        tempArray = tempArray.concat(temp);
      }
    }

    splittedLatex = tempArray;

    // handle therefore and because symbol

    splittedLatex = splittedLatex.map(function (item) {
      item = item.replace(/(\\text)?(\{)?\∴(\})?(\\\:)?/g, '\\therefore ');
      item = item.replace(/(\\text)?(\{)?\∵(\})?(\\\:)?/g, '\\because ');
      return item;
    });

    return splittedLatex;
  }