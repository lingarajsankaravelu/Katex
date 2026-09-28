package hourglass.github.`in`.katex.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import hourglass.github.`in`.katex.R

class MathviewInLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mathview_in_layout)
        setInitialViews()
    }

    private fun setInitialViews() {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Katex MathView In Layout Demo"
    }
}
