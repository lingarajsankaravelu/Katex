package hourglass.github.`in`.katex.activities

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hourglass.github.`in`.katex.R
import hourglass.github.`in`.katex.adapters.MathListAdapter
import hourglass.github.`in`.katex.getFormulas

class MathViewListActivity : AppCompatActivity() {

    private var formulas: List<String> = emptyList()
    private lateinit var recyclerView: RecyclerView
    private lateinit var mathListAdapter: MathListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mathview_list)
        retriveFormulas()
        setInitialViews()
    }

    private fun setInitialViews() {
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.setHasFixedSize(false)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        mathListAdapter = MathListAdapter(this, CardClick(), formulas)
        recyclerView.adapter = mathListAdapter
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "Katex MathView In List Demo"
        Log.d(TAG, "Layout Views Initialized")
    }

    private fun retriveFormulas() {
        formulas = getFormulas(this)
        Log.d(TAG, "Formulas loaded from String array")
    }

    inner class CardClick : View.OnClickListener {
        override fun onClick(view: View) {
            Toast.makeText(applicationContext, "Clicked", Toast.LENGTH_SHORT).show()
            val position = recyclerView.getChildAdapterPosition(view)
            mathListAdapter.toggleMarked(position)
            Log.d(TAG, "Card Click Position:$position")
        }
    }

    companion object {
        private const val TAG = "MATHVIEWINLIST"
    }
}
