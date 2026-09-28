@file:JvmName("Helpers")

package hourglass.github.`in`.katex

import android.content.Context
import androidx.core.content.ContextCompat

fun getRandomColor(context: Context, i: Int): Int {
    return when (i) {
        1 -> ContextCompat.getColor(context, R.color.Color1)
        2 -> ContextCompat.getColor(context, R.color.Color2)
        3 -> ContextCompat.getColor(context, R.color.Color3)
        4 -> ContextCompat.getColor(context, R.color.Color4)
        5 -> ContextCompat.getColor(context, R.color.Color5)
        6 -> ContextCompat.getColor(context, R.color.Color6)
        7 -> ContextCompat.getColor(context, R.color.Color7)
        8 -> ContextCompat.getColor(context, R.color.Color8)
        9 -> ContextCompat.getColor(context, R.color.Color9)
        10 -> ContextCompat.getColor(context, R.color.Color10)
        11 -> ContextCompat.getColor(context, R.color.Color11)
        12 -> ContextCompat.getColor(context, R.color.Color12)
        13 -> ContextCompat.getColor(context, R.color.Color13)
        14 -> ContextCompat.getColor(context, R.color.Color14)
        15 -> ContextCompat.getColor(context, R.color.Color15)
        16 -> ContextCompat.getColor(context, R.color.Color16)
        else -> ContextCompat.getColor(context, R.color.cardview_dark_background)
    }
}
