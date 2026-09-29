package katex.hourglass.`in`.mathlib

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.core.content.ContextCompat

class MathView : WebView {

  private var displayText: String? = null
  private var textColor: Int = 0
  private var textSize: Int = 0
  private var clickable: Boolean = false
  private var enableZoomInControls: Boolean = false

  constructor(context: Context) : super(context) {
    configurationSettingWebView(enableZoomInControls)
    setDefaultTextColor(context)
    setDefaultTextSize()
  }

  constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
    configurationSettingWebView(enableZoomInControls)
    @SuppressLint("ResourceType")
    val typedArray: TypedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.MathView, 0, 0)
    try {
      setBackgroundColor(
        typedArray.getInteger(
          R.styleable.MathView_setViewBackgroundColor,
          ContextCompat.getColor(context, android.R.color.transparent)
        )
      )
      setTextColor(
        typedArray.getColor(
          R.styleable.MathView_setTextColor,
          ContextCompat.getColor(context, android.R.color.black)
        )
      )
      pixelSizeConversion(typedArray.getDimension(R.styleable.MathView_setTextSize, DEFAULT_TEXT_SIZE))
      setDisplayText(typedArray.getString(R.styleable.MathView_setText))
      setClickable(typedArray.getBoolean(R.styleable.MathView_setClickable, false))
    } catch (e: RuntimeException) {
      Log.w(TAG, "Failed to read MathView styled attributes", e)
    } finally {
      // Not try-with-resources: TypedArray only implements AutoCloseable since API 31,
      // below this view's minSdk 23 — an explicit recycle() avoids a NoSuchMethodError there.
      typedArray.recycle()
    }
  }

  fun setViewBackgroundColor(color: Int) {
    setBackgroundColor(color)
    invalidate()
  }

  private fun pixelSizeConversion(dimension: Float) {
    if (dimension == DEFAULT_TEXT_SIZE) {
      setTextSize(DEFAULT_TEXT_SIZE.toInt())
    } else {
      val pixelDimenEquivalentSize = (dimension.toDouble() / 1.6).toInt()
      setTextSize(pixelDimenEquivalentSize)
    }
  }

  @SuppressLint("SetJavaScriptEnabled")
  private fun configurationSettingWebView(enableZoomInControls: Boolean) {
    setLayerType(LAYER_TYPE_HARDWARE, null)
    val settings: WebSettings = getSettings()
    settings.javaScriptEnabled = true
    settings.displayZoomControls = enableZoomInControls
    settings.builtInZoomControls = enableZoomInControls
    settings.setSupportZoom(enableZoomInControls)
    isVerticalScrollBarEnabled = enableZoomInControls
    isHorizontalScrollBarEnabled = enableZoomInControls
    Log.d(TAG, "Zoom in controls:$enableZoomInControls")
  }

  fun setDisplayText(formulaText: String?) {
    displayText = formulaText
    loadData()
  }

  private fun getOfflineKatexConfig(formulaText: String): String {
    return """
      <!DOCTYPE html>
      <html>
          <head>
              <meta charset="UTF-8">
              <title>Auto-render test</title>
              <link rel="stylesheet" type="text/css" href="file:///android_asset/katex/katex.min.css">
              <link rel="stylesheet" type="text/css" href="file:///android_asset/themes/style.css">
              <script type="text/JavaScript" src="file:///android_asset/katex/katex.min.js"></script>
              <script type="text/JavaScript" src="file:///android_asset/katex/contrib/auto-render.min.js"></script>
              <script type="text/JavaScript" src="file:///android_asset/jquery.min.js"></script>
              <script type="text/JavaScript" src="file:///android_asset/latex_parser.js"></script>
              <meta name="viewport" content="width=device-width"/>
              <link rel="stylesheet" href="file:///android_asset/webviewstyle.css"/>
              <style type='text/css'>
                  body {
                      margin: 0px;
                      padding: 0px;
                      font-size:${textSize}px;
                      color:${getHexColor(textColor)};
                  }
              </style>
          </head>
          <body>
              $formulaText
          </body>
      </html>
    """.trimIndent()
  }

  fun setTextSize(size: Int) {
    textSize = size
    loadData()
  }

  fun setTextColor(color: Int) {
    textColor = color
    loadData()
  }

  private fun getHexColor(intColor: Int): String {
     /* Android and JavaScript color format differ; JavaScript supports hex color
        Android color the user sets is converted to a hex color to replicate it in JavaScript.
      */
    val hexColor = String.format("#%06X", 0xFFFFFF and intColor)
    Log.d(TAG, "Hex Color:$hexColor")
    return hexColor
  }

  private fun setDefaultTextColor(context: Context) {
    // sets default text color to black
    textColor = ContextCompat.getColor(context, android.R.color.black)
  }

  private fun setDefaultTextSize() {
    // sets view default text size to 18
    textSize = DEFAULT_TEXT_SIZE.toInt()
  }

  private fun loadData() {
    displayText?.let { formula ->
      loadDataWithBaseURL("null", getOfflineKatexConfig(formula), "text/html", "UTF-8", "about:blank")
    }
  }

  override fun setClickable(clickable: Boolean) {
    isEnabled = true
    this.clickable = clickable
    enableZoomInControls = !clickable
    configurationSettingWebView(enableZoomInControls)
    invalidate()
  }

  @SuppressLint("ClickableViewAccessibility")
  override fun onTouchEvent(event: MotionEvent): Boolean {
    return if (clickable && event.action == MotionEvent.ACTION_DOWN) {
      callOnClick()
      false
    } else {
      super.onTouchEvent(event)
    }
  }

  companion object {
    private const val TAG = "KhanAcademyKatexView"
    private const val DEFAULT_TEXT_SIZE = 18f
  }
}
