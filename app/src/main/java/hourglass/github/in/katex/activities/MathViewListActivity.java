package hourglass.github.in.katex.activities;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import hourglass.github.in.katex.DataHelpers;
import hourglass.github.in.katex.R;
import hourglass.github.in.katex.adapters.MathListAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lingaraj on 4/4/17.
 */

public class MathViewListActivity extends AppCompatActivity {

    private List<String> formulas = new ArrayList<>();
    private String TAG = "MATHVIEWINLIST";
    private RecyclerView mRecyclerview;
    private MathListAdapter math_list_adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathview_list);
        retriveFormulas();
        setInitialViews();

    }

    private void setInitialViews() {
        mRecyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        mRecyclerview.setHasFixedSize(false);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        math_list_adapter = new MathListAdapter(MathViewListActivity.this,new CardClick(),formulas);
        mRecyclerview.setAdapter(math_list_adapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Katex MathView In List Demo");

        Log.d(TAG,"Layout Views Initialized");


    }

    private void retriveFormulas() {
        formulas = DataHelpers.getFormulas(MathViewListActivity.this);
        Log.d(TAG,"Formulas loaded from String array");

    }

    public class CardClick implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),"Clicked", Toast.LENGTH_SHORT).show();
            int position = mRecyclerview.getChildAdapterPosition(view);
            math_list_adapter.toggleMarked(position);
            Log.d(TAG,"Card Click Position:"+position);

        }
    }
}
