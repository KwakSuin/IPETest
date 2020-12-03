package kwaksuin.portfolio.ipetest.write;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import kwaksuin.portfolio.ipetest.R;

public class WriteMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write_menu);

        TextView test01 = findViewById(R.id.test01);
        test01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Write_50.class);
                startActivity(intent);
            }
        });
    }
}