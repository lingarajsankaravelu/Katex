package katex.hourglass.`in`.mathlib

import android.app.Activity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.FrameLayout

class MathViewTestActivity : Activity() {

  lateinit var mathView: MathView
    private set

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    mathView = MathView(this).apply {
      layoutParams = ViewGroup.LayoutParams(
        ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.MATCH_PARENT
      )
    }
    setContentView(FrameLayout(this).apply { addView(mathView) })
  }
}
