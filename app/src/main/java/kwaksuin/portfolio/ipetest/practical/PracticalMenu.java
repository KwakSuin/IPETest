package kwaksuin.portfolio.ipetest.practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import kwaksuin.portfolio.ipetest.R;

public class PracticalMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practical_menu);

        TextView test01 = findViewById(R.id.test01);
        test01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Practical50_container.class);
                startActivity(intent);
            }
        });
    }
}