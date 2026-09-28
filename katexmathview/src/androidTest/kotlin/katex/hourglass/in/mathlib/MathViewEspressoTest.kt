package katex.hourglass.`in`.mathlib

import androidx.test.espresso.web.sugar.Web.onWebView
import androidx.test.espresso.web.webdriver.DriverAtoms.findElement
import androidx.test.espresso.web.webdriver.Locator
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

/**
 * Not run in CI (requires a device/emulator) — run locally via
 * `./gradlew :katexmathview:connectedDebugAndroidTest` against an emulator or device.
 */
class MathViewEspressoTest {

  @get:Rule
  val activityRule = ActivityScenarioRule(MathViewTestActivity::class.java)

  @Test
  fun rendersKatexOutputForAFormula() {
    activityRule.scenario.onActivity { activity ->
      activity.mathView.setDisplayText("x^2 + y^2 = z^2")
    }

    onWebView()
      .forceJavascriptEnabled()
      .withElement(findElement(Locator.CLASS_NAME, "katex"))
  }
}
