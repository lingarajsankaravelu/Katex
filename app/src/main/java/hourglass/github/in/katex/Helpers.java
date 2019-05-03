package hourglass.github.in.katex;

import android.content.Context;
import android.support.v4.content.ContextCompat;

/**
 * Created by lingaraj on 4/4/17.
 */

public class Helpers {
    public static int getRandomColor(Context context,int i) {
        switch (i) {
            case 1:
                return ContextCompat.getColor(context,R.color.Color1);
            case 2:
                return ContextCompat.getColor(context,R.color.Color2);
            case 3:
                return ContextCompat.getColor(context,R.color.Color3);
            case 4:
                return ContextCompat.getColor(context,R.color.Color4);
            case 5:
                return ContextCompat.getColor(context,R.color.Color5);
            case 6:
                return ContextCompat.getColor(context,R.color.Color6);
            case 7:
                return ContextCompat.getColor(context,R.color.Color7);
            case 8:
                return ContextCompat.getColor(context,R.color.Color8);
            case 9:
                return ContextCompat.getColor(context,R.color.Color9);
            case 10:
                return ContextCompat.getColor(context,R.color.Color10);
            case 11:
                return ContextCompat.getColor(context,R.color.Color11);
            case 12:
                return ContextCompat.getColor(context,R.color.Color12);
            case 13:
                return ContextCompat.getColor(context,R.color.Color13);
            case 14:
                return ContextCompat.getColor(context,R.color.Color14);
            case 15:
                return ContextCompat.getColor(context,R.color.Color15);
            case 16:
                return ContextCompat.getColor(context,R.color.Color16);
            default:
                return ContextCompat.getColor(context,R.color.cardview_dark_background);
        }
    }
}
