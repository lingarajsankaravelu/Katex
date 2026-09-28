package hourglass.github.in.katex.activities;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import hourglass.github.in.katex.R;

/**
 * Created by lingaraj on 4/4/17.
 */

public class MathviewInLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathview_in_layout);
        setInitialViews();
    }

    private void setInitialViews() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Katex MathView In Layout Demo");

    }
}
