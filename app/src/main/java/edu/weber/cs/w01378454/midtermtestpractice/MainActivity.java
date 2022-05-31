package edu.weber.cs.w01378454.midtermtestpractice;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BottomFragment.onButtonListener{

    private TopFragment topFragment;
    private BottomFragment bottomFragment;

    FragmentManager fm;

    @Override
    public void MathButtonPressed(double num1, double num2, String mathsign, double answer) {

        if(topFragment == null)
        {
            fm = getSupportFragmentManager();
            topFragment = (TopFragment) fm.findFragmentById(R.id.TopFragmentHolder);
        }

        topFragment.updateMathText(num1, num2, mathsign, answer);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        fm=getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.TopFragmentHolder, new TopFragment(), "TopFragment")
                .replace(R.id.BottomFragmentHolder, new BottomFragment(), "BottomFragment")

        .commit();

    }
}