package katex.hourglass.in.mathlib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;


/**
 * Created by lingaraj on 3/15/17.
 */

public class MathView extends WebView {
    private String TAG = "KhanAcademyKatexView";
    private static final float default_text_size = 18;
    private String display_text;
    private int text_color;
    private int text_size;
    
     

    public MathView(Context context) {
        super(context);
        configurationSettingWebView();
        setDefaultTextColor(context);
        setDefaultTextSize();
    }



    public MathView(Context context, AttributeSet attrs) {
        super(context, attrs);
        configurationSettingWebView();
        TypedArray mTypeArray = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.MathView,
                0, 0);
        try {
            setBackgroundColor(mTypeArray.getInteger(R.styleable.MathView_setViewBackgroundColor,ContextCompat.getColor(context,android.R.color.transparent)));
            setTextColor(mTypeArray.getColor(R.styleable.MathView_setTextColor,ContextCompat.getColor(context,android.R.color.black)));
            pixelSizeConversion(mTypeArray.getDimension(R.styleable.MathView_setTextSize,default_text_size));
            setDisplayText(mTypeArray.getString(R.styleable.MathView_setText));


        }
        catch (Exception e)
        {
            Log.d(TAG,"Exception:"+e.toString());
        }


    }
    public void setViewBackgroundColor(int color)
    {
        setBackgroundColor(color);
        this.invalidate();
    }

    private void pixelSizeConversion(float dimension) {
        if (dimension==default_text_size)
        {
            setTextSize((int)default_text_size);
        }
        else
        {
            int pixel_dimen_equivalent_size = (int) ((double) dimension / 1.6);
            setTextSize(pixel_dimen_equivalent_size);
        }
    }


    @SuppressLint({"SetJavaScriptEnabled", "NewApi"})
    private void configurationSettingWebView()
    {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowFileAccess(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
    }


    public void setDisplayText(String formula_text) {
        this.display_text = formula_text;
        loadData();
    }


   private String getOfflineKatexConfig()
    {
        String offline_config = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <meta charset=\"UTF-8\">\n" +
                "        <title>Auto-render test</title>\n" +
                "        <link rel=\"stylesheet\" type=\"text/css\" href=\"file:///android_asset/katex/katex.min.css\">\n" +
                "        <link rel=\"stylesheet\" type=\"text/css\" href=\"file:///android_asset/themes/style.css\">\n" +
                "        <script type=\"text/javascript\" src=\"file:///android_asset/katex/katex.min.js\"></script>\n" +
                "        <script type=\"text/javascript\" src=\"file:///android_asset/katex/contrib/auto-render.min.js\"></script>\n" +
                " <style type='text/css'>"+
                "body {"+
                "margin: 0px;"+
                "padding: 0px;"+
                "font-size:" +this.text_size+"px;"+
                "color:"+getHexColor(this.text_color)+";"+
                " }"+
                " </style>"+
                "    </head>\n" +
                "    <body>\n" +
                "        {formula}\n" +
                "        <script>\n" +
                "          renderMathInElement(\n" +
                "              document.body\n" +
                "          );\n" +
                "        </script>\n" +
                "    </body>\n" +
                "</html>";
        return   offline_config.replace("{formula}",this.display_text);


    }

    public void setTextSize(int size)
    {
       this.text_size = size;
       loadData();

    }
    public void setTextColor(int color)
    {

        this.text_color = color;
        loadData();
    }
    private String getHexColor(int intColor)
    {
        //Android and javascript color format differ javascript support Hex color, so the android color which user sets is converted to hexcolor to replicate the same in javascript.
        String hexColor = String.format("#%06X", (0xFFFFFF & intColor));
        Log.d(TAG,"Hex Color:"+hexColor);
        return hexColor;
    }


    private void setDefaultTextColor(Context context) {
        //sets default text color to black
        this.text_color = ContextCompat.getColor(context,android.R.color.black);

    }

    private void setDefaultTextSize() {
        //sets view default text size to 18
        this.text_size =(int) default_text_size;
    }

    private void loadData()
    {
        if (this.display_text!=null)
        {
            this.loadDataWithBaseURL("null",getOfflineKatexConfig(),"text/html","UTF-8","about:blank");
        }

    }


}
