package hourglass.github.`in`.katex.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import hourglass.github.`in`.katex.R
import hourglass.github.`in`.katex.getRandomColor
import hourglass.github.`in`.katex.activities.MathViewListActivity
import katex.hourglass.`in`.mathlib.MathView

class MathListAdapter(
    private val context: Context,
    private val cardClick: MathViewListActivity.CardClick,
    private var formulas: List<String>
) : RecyclerView.Adapter<MathListAdapter.ViewHolder>() {

    private var selectedCardPosition: Int = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(context)
            .inflate(R.layout.card_math_recyclerview, parent, false)
        v.setOnClickListener(cardClick)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (selectedCardPosition == position) {
            holder.mathView.setViewBackgroundColor(ContextCompat.getColor(context, R.color.cardview_light_background))
            holder.mathView.setTextColor(ContextCompat.getColor(context, R.color.cardview_dark_background))
            holder.mathView.setTextSize(14)
        } else {
            holder.mathView.setViewBackgroundColor(getRandomColor(context, position))
            holder.mathView.setTextColor(ContextCompat.getColor(context, R.color.cardview_light_background))
            holder.mathView.setTextSize(14)
        }
        holder.mathView.setDisplayText(formulas[position])
    }

    override fun getItemCount(): Int {
        return formulas.size
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val mathView: MathView = v.findViewById(R.id.math_view)
    }

    fun toggleMarked(position: Int) {
        selectedCardPosition = if (selectedCardPosition == position) -1 else position
        notifyItemChanged(position)
    }
}
