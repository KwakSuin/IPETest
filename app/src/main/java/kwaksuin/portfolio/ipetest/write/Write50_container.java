package kwaksuin.portfolio.ipetest.write;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import kwaksuin.portfolio.ipetest.R;

public class Write50_container extends AppCompatActivity {
    FragmentManager fragmentmanager;
    FragmentTransaction transaction;
    Write50_01 page01;
    Write50_02 page02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write50_container);

        fragmentmanager = getSupportFragmentManager();

        page01 = new Write50_01();
        transaction = fragmentmanager.beginTransaction();
        transaction.replace(R.id.container,page01).commitAllowingStateLoss();

    }
}