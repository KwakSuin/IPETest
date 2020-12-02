package kwaksuin.portfolio.ipetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import kwaksuin.portfolio.ipetest.practical.PracticalMenu;
import kwaksuin.portfolio.ipetest.write.WriteMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView write = findViewById(R.id.write);
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WriteMenu.class);
                Toast.makeText(getApplicationContext(),"필기",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        TextView practical = findViewById(R.id.practical);
        practical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PracticalMenu.class);
                Toast.makeText(getApplicationContext(),"실기(단답형)",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}