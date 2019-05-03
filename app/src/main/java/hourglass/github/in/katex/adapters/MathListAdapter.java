package hourglass.github.in.katex.adapters;

/**
 * Created by lingaraj on 4/4/17.
 */

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hourglass.github.in.katex.Helpers;
import hourglass.github.in.katex.R;
import hourglass.github.in.katex.activities.MathViewListActivity;
import java.util.ArrayList;
import java.util.List;
import katex.hourglass.in.mathlib.MathView;

/**
 * Created by nrupul on 3/7/16.
 */
public class MathListAdapter extends RecyclerView.Adapter<MathListAdapter.ViewHolder> {

    private String TAG = "MATH_LIST_ADAP";
    private MathViewListActivity.CardClick cardClick;
    private int selected_card_position = -1;
    private List<String> formulas = new ArrayList<String>();
    private Context mContext;
    
   
    public MathListAdapter(
        Context context,MathViewListActivity.CardClick click,  List<String> formulas_list)
    {
        //Full Page Correction Rubric list click
        this.mContext = context;
       this.cardClick = click;
       this.formulas = formulas_list;
    }





    @Override
    public MathListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(this.mContext)
                .inflate(R.layout.card_math_recyclerview, parent, false);
        v.setOnClickListener(this.cardClick);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MathListAdapter.ViewHolder holder, int position) {
       if (selected_card_position==position) {
            holder.math_view.setViewBackgroundColor(ContextCompat.getColor(mContext, R.color.cardview_light_background));
            holder.math_view.setTextColor(ContextCompat.getColor(mContext,R.color.cardview_dark_background));
            holder.math_view.setTextSize(14);
        }
        else {
            holder.math_view.setViewBackgroundColor(Helpers.getRandomColor(mContext,position));
            holder.math_view.setTextColor(ContextCompat.getColor(mContext,R.color.cardview_light_background));
            holder.math_view.setTextSize(14);
        }
        holder.math_view.setDisplayText(formulas.get(position));

    }



    @Override
    public int getItemCount() {

            return formulas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        MathView math_view;


        public ViewHolder(View v) {
            super(v);
            cardView = (CardView) v.findViewById(R.id.card_view);
            math_view = (MathView) v.findViewById(R.id.math_view);
         }
    }


    public void toggleMarked(int position) {
          if (selected_card_position==position)
          {
              selected_card_position = -1;
              //de selecting a previous selection;
          }
          else
          {
              selected_card_position = position;
              // mentioning a new selection
          }
          notifyItemChanged(position);
    }


}
