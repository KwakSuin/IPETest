package kwaksuin.portfolio.ipetest.practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import kwaksuin.portfolio.ipetest.R;
import kwaksuin.portfolio.ipetest.practical.exam.PracticalExam_container;
import kwaksuin.portfolio.ipetest.practical.problem50.Practical50_container;

public class PracticalMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_menu);

        // 실기 단답형 50문제
        TextView test01 = findViewById(R.id.test01);
        test01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Practical50_container.class);
                startActivity(intent);
            }
        });

        // 실제 실기 기출문제
        TextView test03 = findViewById(R.id.test03);
        test03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PracticalExam_container.class);
                startActivity(intent);
            }
        });
    }
}