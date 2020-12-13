package kwaksuin.portfolio.ipetest.practical.problem100;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import kwaksuin.portfolio.ipetest.R;
import kwaksuin.portfolio.ipetest.practical.problem50.Practical50_01;

public class Problem100_container extends AppCompatActivity {
    FragmentManager fragmentmanager;
    FragmentTransaction transaction;
    Practical100_01 page01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.problem100_container);

        fragmentmanager = getSupportFragmentManager();

        page01 = new Practical100_01();
        transaction = fragmentmanager.beginTransaction();
        transaction.replace(R.id.container,page01).commitAllowingStateLoss();
    }
}