package hourglass.github.in.katex;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataHelpers {
  private static final String TAG = "DATA";
  public static String getMathWithDisplayStyle(){
    return "$\\displaystyle {1 +  \\frac{q^2}{(1-q)}+\\frac{q^6}{(1-q)(1-q^2)}+\\cdots }= \\prod_{j=0}^{\\infty}\\frac{1}{(1-q^{5j+2})(1-q^{5j+3})}, \\quad\\quad \\text{for }\\lvert q\\rvert&lt;1.</annotation>$";
  }

  public static String getScrollableData(){
    return "<p>(a) $\\frac{1}{18}$</p> <p>(b) $\\frac{7}{18}$</p> <p>(c) $\\frac{5}{18}$</p> <p>(d) $\\frac{1}{9}$</p> <p><!--more--></p> <p><strong>Ans: $\\frac{5}{18}$</strong></p> <p><strong>Solution</strong></p> <p>Hints : &#8211; Let, C be the event that &#8216;the difference of nos. shown is 1&#8217;</p> <p>$C = \\left \\{ \\left ( 1, 2 \\right )\\left ( 2, 1 \\right )\\left ( 2, 3 \\right )\\left ( 3, 2 \\right )\\left ( 3, 4 \\right )\\left ( 4, 3 \\right )\\left ( 4, 5 \\right )\\left ( 5, 4 \\right )\\left ( 5, 6 \\right )\\left ( 6, 5 \\right ) \\right \\}$</p> <p>∴ $n\\left ( C \\right ) = 10$ , $n\\left ( S \\right ) = 36$</p> <p>∴ $P\\left ( C \\right ) = \\frac{n\\left ( C \\right )}{n\\left ( S \\right )}$</p> <p>$=\\frac{10}{36}$</p> <p>$=\\frac{5}{18}$</p> <p><strong>Table Example:</strong></p> <table border=\"1\" style=\"border-collapse: collapse; width: 596px;\"> <tbody> <tr> <td style=\"width: 101px; text-align: center;\">$2x+y^{2}$</td> <td style=\"width: 127px; text-align: center;\">$C = \\left \\{ \\left ( 1, 2 \\right )\\left ( 2, 1 \\right )\\left ( 2, 3 \\right )\\left ( 3, 2 \\right )\\left ( 3, 4 \\right )\\left ( 4, 3 \\right )\\left ( 4, 5 \\right )\\left ( 5, 4 \\right )\\left ( 5, 6 \\right )\\left ( 6, 5 \\right ) \\right \\}$</td> <td style=\"width: 168px; text-align: center;\">$\\large \\frac{12-n+5}{30\\left ( n-5 \\right )}=\\frac{1}{\\left ( n-4 \\right )\\left ( n-5 \\right )}$</td> <td style=\"width: 131px; text-align: center;\">$\\large \\frac{2}{5\\left ( n-5 \\right )}=\\frac{1}{\\left ( n-4 \\right )\\left ( n-5 \\right )}+\\frac{1}{30}$</td> </tr> <tr> <td style=\"width: 101px; text-align: center;\">Row 2 Column 1</td> <td style=\"width: 127px; text-align: center;\">Row 2 Column 2</td> <td style=\"width: 168px; text-align: center;\">Row 2 Column 3</td> <td style=\"width: 131px; text-align: center;\">Row 2 Column 4</td> </tr> <tr> <td style=\"width: 101px; text-align: center;\">Test</td> <td style=\"width: 127px; text-align: center;\">Test</td> <td style=\"width: 168px; text-align: center;\">$\\frac{5}{18}$</td> <td style=\"width: 131px; text-align: center;\"></td> </tr> </tbody> </table>";
  }

  public static String getSimpleMath(){
    return "${\rm{Mn}}{{\rm{O}}_{\rm{2}}}$";
  }

  public static String getPlainTextWithMath(){
     return "This formula $f(x) = x^2$ is an example.";

  }

  public static  String getNormalHtmlData() {
    return "<p>\n"
        + "    As Xenophanes recognized as long ago as the sixth century before Christ,\n"
        + "    whether or not God made man in His own image, it is certain that man makes\n"
        + "    gods in his. The gods of Greek mythology first appear in the writings of\n"
        + "    Homer and Hesiod, and, from the character and actions of these picturesque\n"
        + "    and, for the most part, friendly beings, we get some idea of the men who\n"
        + "    made them and brought them to Greece.\n"
        + "</p>\n"
        + "<p>\n"
        + "    But ritual is more fundamental than mythology, and the study of Greek\n"
        + "    ritual during recent years has shown that, beneath the belief or skepticism\n"
        + "    with which the Olympians were regarded, lay an older magic, with\n"
        + "    traditional rites for the promotion of fertility by the celebration of the\n"
        + "    annual cycle of life and death, and the propitiation of unfriendly ghosts,\n"
        + "    gods or demons. Against this dark and dangerous background arose Olympic\n"
        + "    mythology on the one hand and early philosophy and science on the other.\n"
        + "</p>\n"
        + "<p>\n"
        + "    In classical times the need of a creed higher than the Olympian was felt,\n"
        + "    and Aeschylus, Sophocles and Plato finally evolved from the pleasant but\n"
        + "    crude polytheism the idea of a single, supreme and righteous Zeus. But the\n"
        + "    decay of Olympus led to a revival of old and the invasion of new magic\n"
        + "    cults among the people, while some philosophers were looking to a vision of\n"
        + "    the uniformity of nature under divine and universal law.\n"
        + "</p>\n"
        + "<p>\n"
        + "    From Sir William Cecil Dampier, <em>A Shorter History of Science</em>,\n"
        + "    ©1957, Meridian Books.\n"
        + "</p>";
  }

  public static String getMathQuestionWithHtmlTags(){
    return "<p>\n"
        + "\t<span class=\"note-math-description\">\n"
        + "\t\t<span class=\"katex\">\n"
        + "\t\t\t<span class=\"katex-mathml\">\n"
        + "\t\t\t\t<math>\n"
        + "\t\t\t\t\t<semantics>\n"
        + "\t\t\t\t\t\t<mrow>\n"
        + "\t\t\t\t\t\t\t<mi>x</mi>\n"
        + "\t\t\t\t\t\t\t<mo>=</mo>\n"
        + "\t\t\t\t\t\t\t<mrow>\n"
        + "\t\t\t\t\t\t\t\t<mo fence=\"true\">{</mo>\n"
        + "\t\t\t\t\t\t\t\t<mtable>\n"
        + "\t\t\t\t\t\t\t\t\t<mtr>\n"
        + "\t\t\t\t\t\t\t\t\t\t<mtd>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t<mstyle scriptlevel=\"0\" displaystyle=\"false\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t<mi>a</mi>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t</mstyle>\n"
        + "\t\t\t\t\t\t\t\t\t\t</mtd>\n"
        + "\t\t\t\t\t\t\t\t\t\t<mtd>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t<mstyle scriptlevel=\"0\" displaystyle=\"false\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t<mrow>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t<mtext>if&nbsp;</mtext>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t<mi>b</mi>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t</mrow>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t</mstyle>\n"
        + "\t\t\t\t\t\t\t\t\t\t</mtd>\n"
        + "\t\t\t\t\t\t\t\t\t</mtr>\n"
        + "\t\t\t\t\t\t\t\t\t<mtr>\n"
        + "\t\t\t\t\t\t\t\t\t\t<mtd>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t<mstyle scriptlevel=\"0\" displaystyle=\"false\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t<mi>c</mi>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t</mstyle>\n"
        + "\t\t\t\t\t\t\t\t\t\t</mtd>\n"
        + "\t\t\t\t\t\t\t\t\t\t<mtd>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t<mstyle scriptlevel=\"0\" displaystyle=\"false\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t<mrow>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t<mtext>if&nbsp;</mtext>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t<mi>d</mi>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t</mrow>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t</mstyle>\n"
        + "\t\t\t\t\t\t\t\t\t\t</mtd>\n"
        + "\t\t\t\t\t\t\t\t\t</mtr>\n"
        + "\t\t\t\t\t\t\t\t</mtable>\n"
        + "\t\t\t\t\t\t\t</mrow>\n"
        + "\t\t\t\t\t\t</mrow>\n"
        + "\t\t\t\t\t\t<annotation encoding=\"application/x-tex\">$x = \\begin{cases} a &amp;amp;\\text{if } b \\\\ c &amp;amp;\\text{if } d \\end{cases}$</annotation>\n"
        + "\t\t\t\t\t</semantics>\n"
        + "\t\t\t\t</math>\n"
        + "\t\t\t</span>\n"
        + "\t\t\t<span class=\"katex-html\" aria-hidden=\"true\">\n"
        + "\t\t\t\t<span class=\"base\">\n"
        + "\t\t\t\t\t<span class=\"strut\" style=\"height: 0.43056em; vertical-align: 0em;\"></span>\n"
        + "\t\t\t\t\t<span class=\"mord mathdefault\">x</span>\n"
        + "\t\t\t\t\t<span class=\"mspace\" style=\"margin-right: 0.277778em;\"></span>\n"
        + "\t\t\t\t\t<span class=\"mrel\">=</span>\n"
        + "\t\t\t\t\t<span class=\"mspace\" style=\"margin-right: 0.277778em;\"></span>\n"
        + "\t\t\t\t</span>\n"
        + "\t\t\t\t<span class=\"base\">\n"
        + "\t\t\t\t\t<span class=\"strut\" style=\"height: 3.00003em; vertical-align: -1.25003em;\"></span>\n"
        + "\t\t\t\t\t<span class=\"minner\">\n"
        + "\t\t\t\t\t\t<span class=\"mopen delimcenter\" style=\"top: 0em;\">\n"
        + "\t\t\t\t\t\t\t<span class=\"delimsizing size4\">{</span>\n"
        + "\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t<span class=\"mord\">\n"
        + "\t\t\t\t\t\t\t<span class=\"mtable\">\n"
        + "\t\t\t\t\t\t\t\t<span class=\"col-align-l\">\n"
        + "\t\t\t\t\t\t\t\t\t<span class=\"vlist-t vlist-t2\">\n"
        + "\t\t\t\t\t\t\t\t\t\t<span class=\"vlist-r\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t<span class=\"vlist\" style=\"height: 1.69em;\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"\" style=\"top: -3.69em;\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"pstrut\" style=\"height: 3.008em;\"></span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"mord\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"mord mathdefault\">a</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"\" style=\"top: -2.25em;\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"pstrut\" style=\"height: 3.008em;\"></span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"mord\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"mord mathdefault\">c</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t<span class=\"vlist-s\">\u200B</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t<span class=\"vlist-r\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t<span class=\"vlist\" style=\"height: 1.19em;\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"\"></span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t<span class=\"arraycolsep\" style=\"width: 1em;\"></span>\n"
        + "\t\t\t\t\t\t\t\t<span class=\"col-align-l\">\n"
        + "\t\t\t\t\t\t\t\t\t<span class=\"vlist-t vlist-t2\">\n"
        + "\t\t\t\t\t\t\t\t\t\t<span class=\"vlist-r\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t<span class=\"vlist\" style=\"height: 1.69em;\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"\" style=\"top: -3.69em;\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"pstrut\" style=\"height: 3.008em;\"></span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"mord\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"mord text\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"mord\">if&nbsp;</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"mord mathdefault\">b</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"\" style=\"top: -2.25em;\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"pstrut\" style=\"height: 3.008em;\"></span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"mord\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"mord text\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"mord\">if&nbsp;</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"mord mathdefault\">d</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t<span class=\"vlist-s\">\u200B</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t<span class=\"vlist-r\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t<span class=\"vlist\" style=\"height: 1.19em;\">\n"
        + "\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"\"></span>\n"
        + "\t\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t</span>\n"
        + "\t\t\t\t\t\t<span class=\"mclose nulldelimiter\"></span>\n"
        + "\t\t\t\t\t</span>\n"
        + "\t\t\t\t</span>\n"
        + "\t\t\t</span>\n"
        + "\t\t</span>\n"
        + "\t\t<span class=\"note-latex-description\" style=\"display: none;\">$x = \\begin{cases} a &amp;\\text{if } b \\\\ c &amp;\\text{if } d \\end{cases}$</span>\n"
        + "\t</span>\n"
        + "\t<br>\n"
        + "\t</p>";
  }

  public static List<String> getFormulas(Context context) {
    List<String> formulas = new ArrayList<>(Arrays.asList(context.getResources().getStringArray(R.array.formulas)));
    formulas.add(getMathWithDisplayStyle());
    formulas.add(getSimpleMath());
    formulas.add(getPlainTextWithMath());
    formulas.add(getNormalHtmlData());
    formulas.add(getMathQuestionWithHtmlTags());
    Log.d(TAG,formulas.toArray().toString());
    return formulas;

  }
}
