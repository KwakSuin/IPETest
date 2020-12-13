package kwaksuin.portfolio.ipetest.write.exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import kwaksuin.portfolio.ipetest.R;
import kwaksuin.portfolio.ipetest.practical.exam.PracticalExam_menu;

public class WriteExam_container extends AppCompatActivity {
    FragmentManager fragmentmanager;
    FragmentTransaction transaction;
    WriteExam_menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writeexam_container);

        fragmentmanager = getSupportFragmentManager();

        menu = new WriteExam_menu();
        transaction = fragmentmanager.beginTransaction();
        transaction.replace(R.id.container,menu).commit();
    }
}