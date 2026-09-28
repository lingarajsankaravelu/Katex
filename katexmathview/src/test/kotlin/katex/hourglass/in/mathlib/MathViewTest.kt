package katex.hourglass.`in`.mathlib

import android.graphics.Color
import android.view.MotionEvent
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.Shadows.shadowOf

@RunWith(RobolectricTestRunner::class)
class MathViewTest {

  private val context = RuntimeEnvironment.getApplication()

  @Test
  fun `setDisplayText with null formula does not load any data`() {
    val mathView = MathView(context)

    mathView.setDisplayText(null)

    assertNull(shadowOf(mathView).lastLoadDataWithBaseURL)
  }

  @Test
  fun `setDisplayText injects the formula into the generated HTML body`() {
    val mathView = MathView(context)

    mathView.setDisplayText("x^2 + y^2 = z^2")

    assertTrue(shadowOf(mathView).lastLoadDataWithBaseURL.data.contains("x^2 + y^2 = z^2"))
  }

  @Test
  fun `default text color and size are reflected in the generated HTML`() {
    val mathView = MathView(context)

    mathView.setDisplayText("x")

    val html = shadowOf(mathView).lastLoadDataWithBaseURL.data
    assertTrue(html.contains("font-size:18px"))
    assertTrue(html.contains("color:#000000"))
  }

  @Test
  fun `setTextColor changes the color in the generated HTML`() {
    val mathView = MathView(context)
    mathView.setDisplayText("x")

    mathView.setTextColor(Color.RED)

    assertTrue(shadowOf(mathView).lastLoadDataWithBaseURL.data.contains("color:#FF0000"))
  }

  @Test
  fun `setTextSize changes the font-size in the generated HTML`() {
    val mathView = MathView(context)
    mathView.setDisplayText("x")

    mathView.setTextSize(32)

    assertTrue(shadowOf(mathView).lastLoadDataWithBaseURL.data.contains("font-size:32px"))
  }

  @Test
  fun `attributes constructor applies setText and setTextColor from XML`() {
    val attrs = Robolectric.buildAttributeSet()
      .addAttribute(R.attr.setText, "a+b")
      .addAttribute(R.attr.setTextColor, "#00FF00")
      .build()

    val mathView = MathView(context, attrs)

    val html = shadowOf(mathView).lastLoadDataWithBaseURL.data
    assertTrue(html.contains("a+b"))
    assertTrue(html.contains("color:#00FF00"))
  }

  @Test
  fun `attributes constructor applies setClickable from XML`() {
    val attrs = Robolectric.buildAttributeSet()
      .addAttribute(R.attr.setClickable, "true")
      .build()
    val mathView = MathView(context, attrs)
    var clicked = false
    mathView.setOnClickListener { clicked = true }

    mathView.onTouchEvent(downMotionEvent())

    assertTrue(clicked)
  }

  @Test
  fun `setClickable true disables zoom controls and dispatches clicks on touch-down`() {
    val mathView = MathView(context)
    var clicked = false
    mathView.setOnClickListener { clicked = true }

    mathView.setClickable(true)
    mathView.onTouchEvent(downMotionEvent())

    assertTrue(clicked)
    assertFalse(mathView.settings.builtInZoomControls)
    assertFalse(mathView.settings.displayZoomControls)
  }

  @Test
  fun `setClickable false keeps zoom controls enabled and ignores touch-down`() {
    val mathView = MathView(context)
    var clicked = false
    mathView.setOnClickListener { clicked = true }

    mathView.setClickable(false)
    mathView.onTouchEvent(downMotionEvent())

    assertFalse(clicked)
    assertTrue(mathView.settings.builtInZoomControls)
    assertTrue(mathView.settings.displayZoomControls)
  }

  private fun downMotionEvent(): MotionEvent =
    MotionEvent.obtain(0L, 0L, MotionEvent.ACTION_DOWN, 0f, 0f, 0)
}
