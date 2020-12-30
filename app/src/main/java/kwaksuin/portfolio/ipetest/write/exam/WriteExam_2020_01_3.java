package kwaksuin.portfolio.ipetest.write.exam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import kwaksuin.portfolio.ipetest.R;

public class WriteExam_2020_01_3 extends Fragment {
    WriteExam_2020_01_2 exam02;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.writeexam_2020_01_3, container, false);

        // 정답
        RadioButton num41_01 = rootview.findViewById(R.id.test41_01);
        RadioButton num42_02 = rootview.findViewById(R.id.test42_02);
        RadioButton num43_02 = rootview.findViewById(R.id.test43_02);
        RadioButton num44_04 = rootview.findViewById(R.id.test44_04);
        RadioButton num45_04 = rootview.findViewById(R.id.test45_04);
        RadioButton num46_01= rootview.findViewById(R.id.test46_01);
        RadioButton num47_01 = rootview.findViewById(R.id.test47_01);
        RadioButton num48_01 = rootview.findViewById(R.id.test48_01);
        RadioButton num49_03 = rootview.findViewById(R.id.test49_03);
        RadioButton num50_01 = rootview.findViewById(R.id.test50_01);

        RadioButton num51_04 = rootview.findViewById(R.id.test51_04);
        RadioButton num52_01 = rootview.findViewById(R.id.test52_01);
        RadioButton num53_01 = rootview.findViewById(R.id.test53_01);
        RadioButton num54_02 = rootview.findViewById(R.id.test54_02);
        RadioButton num55_03 = rootview.findViewById(R.id.test55_03);
        RadioButton num56_02 = rootview.findViewById(R.id.test56_02);
        RadioButton num57_02 = rootview.findViewById(R.id.test57_02);
        RadioButton num58_03 = rootview.findViewById(R.id.test58_03);
        RadioButton num59_02 = rootview.findViewById(R.id.test59_02);
        RadioButton num60_04 = rootview.findViewById(R.id.test60_04);


        // 이전 문제
        exam02 = new WriteExam_2020_01_2();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,exam02).commit();
            }
        });

        // 다음문제
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 정답
                if (num41_01.isChecked() && num42_02.isChecked() && num43_02.isChecked() && num44_04.isChecked() && num45_04.isChecked()
                        && num46_01.isChecked() && num47_01.isChecked() && num48_01.isChecked() && num49_03.isChecked() && num50_01.isChecked()
                        && num51_04.isChecked() && num52_01.isChecked() && num53_01.isChecked() && num54_02.isChecked() && num55_03.isChecked()
                        && num56_02.isChecked() && num57_02.isChecked() && num58_03.isChecked() && num59_02.isChecked() && num60_04.isChecked()
                ){
                    // 다음 문제
                }

                // 오답
                if(num41_01.isChecked() == false){
                    TextView error41 = rootview.findViewById(R.id.error41);
                    error41.setVisibility(View.VISIBLE);
                }

                if(num42_02.isChecked() == false){
                    TextView error42 = rootview.findViewById(R.id.error42);
                    error42.setVisibility(View.VISIBLE);
                }

                if(num43_02.isChecked() == false){
                    TextView error43 = rootview.findViewById(R.id.error43);
                    error43.setVisibility(View.VISIBLE);
                }

                if(num44_04.isChecked() == false){
                    TextView error44 = rootview.findViewById(R.id.error44);
                    error44.setVisibility(View.VISIBLE);
                }

                if(num45_04.isChecked() == false){
                    TextView error45 = rootview.findViewById(R.id.error45);
                    error45.setVisibility(View.VISIBLE);
                }

                if(num46_01.isChecked() == false){
                    TextView error46 = rootview.findViewById(R.id.error46);
                    error46.setVisibility(View.VISIBLE);
                }

                if(num47_01.isChecked() == false){
                    TextView error47 = rootview.findViewById(R.id.error47);
                    error47.setVisibility(View.VISIBLE);
                }

                if(num48_01.isChecked() == false){
                    TextView error48 = rootview.findViewById(R.id.error48);
                    error48.setVisibility(View.VISIBLE);
                }

                if(num49_03.isChecked() == false){
                    TextView error49 = rootview.findViewById(R.id.error49);
                    error49.setVisibility(View.VISIBLE);
                }

                if(num50_01.isChecked() == false){
                    TextView error50 = rootview.findViewById(R.id.error50);
                    error50.setVisibility(View.VISIBLE);
                }

                if(num51_04.isChecked() == false){
                    TextView error51 = rootview.findViewById(R.id.error51);
                    error51.setVisibility(View.VISIBLE);
                }

                if(num52_01.isChecked() == false){
                    TextView error52 = rootview.findViewById(R.id.error52);
                    error52.setVisibility(View.VISIBLE);
                }

                if(num53_01.isChecked() == false){
                    TextView error53 = rootview.findViewById(R.id.error53);
                    error53.setVisibility(View.VISIBLE);
                }

                if(num54_02.isChecked() == false){
                    TextView error54 = rootview.findViewById(R.id.error54);
                    error54.setVisibility(View.VISIBLE);
                }

                if(num55_03.isChecked() == false){
                    TextView error55 = rootview.findViewById(R.id.error55);
                    error55.setVisibility(View.VISIBLE);
                }

                if(num56_02.isChecked() == false){
                    TextView error56 = rootview.findViewById(R.id.error56);
                    error56.setVisibility(View.VISIBLE);
                }

                if(num57_02.isChecked() == false){
                    TextView error57 = rootview.findViewById(R.id.error57);
                    error57.setVisibility(View.VISIBLE);
                }

                if(num58_03.isChecked() == false){
                    TextView error58 = rootview.findViewById(R.id.error58);
                    error58.setVisibility(View.VISIBLE);
                }

                if(num59_02.isChecked() == false){
                    TextView error59 = rootview.findViewById(R.id.error59);
                    error59.setVisibility(View.VISIBLE);
                }

                if(num60_04.isChecked() == false){
                    TextView error60 = rootview.findViewById(R.id.error60);
                    error60.setVisibility(View.VISIBLE);
                }

            }
        });


        return rootview;
    }
}