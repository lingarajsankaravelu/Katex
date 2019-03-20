package hourglass.github.in.katex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import katex.hourglass.in.mathlib.MathView;

public class MainActivity extends AppCompatActivity {

    private MathView mathView;
    private String math_formula = "${\rm{Mn}}{{\rm{O}}_{\rm{2}}}$";
    private String question = "This formula $f(x) = x^2$ is an example.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mathView = (MathView) findViewById(R.id.math_view);
        mathView.setDisplayText(math_formula);
    }
}
