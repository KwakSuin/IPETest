package kwaksuin.portfolio.ipetest.practical.exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import kwaksuin.portfolio.ipetest.R;
import kwaksuin.portfolio.ipetest.practical.problem50.Practical50_01;

public class PracticalExam_container extends AppCompatActivity {

    FragmentManager fragmentmanager;
    FragmentTransaction transaction;
    PracticalExam_menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_exam_container);

        fragmentmanager = getSupportFragmentManager();

        menu = new PracticalExam_menu();
        transaction = fragmentmanager.beginTransaction();
        transaction.replace(R.id.container,menu).commit();
    }
}