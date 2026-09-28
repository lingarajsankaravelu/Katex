package hourglass.github.`in`.katex.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import hourglass.github.`in`.katex.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setInitialViews()
    }

    private fun setInitialViews() {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Katex MathView Demo"
    }

    fun recyclerViewClick(view: View) {
        Log.d(TAG, "Using Mathview in Recyclerview Clicked")
        val intent = Intent(applicationContext, MathViewListActivity::class.java)
        startActivity(intent)
    }

    fun layoutViewClick(view: View) {
        Log.d(TAG, "Using MathView in Layout Clicked")
        val intent = Intent(applicationContext, MathviewInLayoutActivity::class.java)
        startActivity(intent)
    }

    fun addingAtRuntime(view: View) {
        Log.d(TAG, "Adding Mathview at runtime Clicked")
        val intent = Intent(applicationContext, MathViewAdditionAtRuntime::class.java)
        startActivity(intent)
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}
