package kwaksuin.portfolio.ipetest.practical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import kwaksuin.portfolio.ipetest.R;
import kwaksuin.portfolio.ipetest.write.Write50_01;

public class Practical50_container extends AppCompatActivity {

    FragmentManager fragmentmanager;
    FragmentTransaction transaction;
    Practical50_01 page01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical50_container);

        fragmentmanager = getSupportFragmentManager();

        page01 = new Practical50_01();
        transaction = fragmentmanager.beginTransaction();
        transaction.replace(R.id.container,page01).commitAllowingStateLoss();

    }
}