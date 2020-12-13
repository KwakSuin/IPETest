package kwaksuin.portfolio.ipetest.write;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import kwaksuin.portfolio.ipetest.R;
import kwaksuin.portfolio.ipetest.write.exam.WriteExam_container;
import kwaksuin.portfolio.ipetest.write.problem50.Write50_container;

public class WriteMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write_menu);

        TextView test01 = findViewById(R.id.test01);
        test01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Write50_container.class);
                startActivity(intent);
            }
        });

        TextView test03 = findViewById(R.id.test03);
        test03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WriteExam_container.class);
                startActivity(intent);
            }
        });
    }
}