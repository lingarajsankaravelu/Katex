package hourglass.github.`in`.katex.activities

import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import hourglass.github.`in`.katex.R
import hourglass.github.`in`.katex.getRandomColor
import hourglass.github.`in`.katex.getScrollableData
import katex.hourglass.`in`.mathlib.MathView

class MathViewAdditionAtRuntime : AppCompatActivity() {

    private lateinit var parentLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_runtime_layout)
        setInitialViews()
        addMathView()
    }

    private fun addMathView() {
        val mathView = MathView(applicationContext)
        mathView.setClickable(false)
        mathView.setTextSize(14)
        mathView.setTextColor(ContextCompat.getColor(applicationContext, android.R.color.white))
        mathView.setDisplayText(getScrollableData())
        // mathView.setDisplayText(getResources().getString(R.string.runtime_formula));
        // mathView.setViewBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.Color5));
        mathView.setViewBackgroundColor(getRandomColor(applicationContext, 2))
        parentLayout.addView(mathView)
        Log.d(TAG, "MathView Added to parent layout at runtime")
    }

    private fun setInitialViews() {
        parentLayout = findViewById(R.id.linear_parent_layout)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Runtime Mathview Demo"
        Log.d(TAG, "Views Intitialized")
    }

    companion object {
        private const val TAG = "MATHVIEWRUNTIME"
    }
}
