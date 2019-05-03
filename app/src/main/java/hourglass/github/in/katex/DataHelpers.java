package hourglass.github.in.katex;

import android.content.Context;
import android.util.Log;
import hourglass.github.in.katex.activities.MathViewListActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataHelpers {
  private static final String TAG = "DATA";
  public static String getMathWithDisplayStyle(){
    return "$\\displaystyle {1 +  \\frac{q^2}{(1-q)}+\\frac{q^6}{(1-q)(1-q^2)}+\\cdots }= \\prod_{j=0}^{\\infty}\\frac{1}{(1-q^{5j+2})(1-q^{5j+3})}, \\quad\\quad \\text{for }\\lvert q\\rvert&lt;1.</annotation>$";
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
