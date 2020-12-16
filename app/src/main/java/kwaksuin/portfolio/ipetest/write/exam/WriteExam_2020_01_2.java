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

import kwaksuin.portfolio.ipetest.R;

public class WriteExam_2020_01_2 extends Fragment {
    WriteExam_2020_01_1 exam01;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.writeexam_2020_01_2, container, false);

        // 정답
        RadioButton num21_04 = rootview.findViewById(R.id.test21_04);
        RadioButton num22_01 = rootview.findViewById(R.id.test22_01);
        RadioButton num23_04 = rootview.findViewById(R.id.test23_04);
        RadioButton num24_02 = rootview.findViewById(R.id.test24_02);
        RadioButton num25_04 = rootview.findViewById(R.id.test25_04);
        RadioButton num26_04 = rootview.findViewById(R.id.test26_04);
        RadioButton num27_02 = rootview.findViewById(R.id.test27_02);
        RadioButton num28_03 = rootview.findViewById(R.id.test28_03);
        RadioButton num29_01 = rootview.findViewById(R.id.test29_01);
        RadioButton num30_01 = rootview.findViewById(R.id.test30_01);

        RadioButton num31_02 = rootview.findViewById(R.id.test31_02);
        RadioButton num32_04 = rootview.findViewById(R.id.test32_04);
        RadioButton num33_03 = rootview.findViewById(R.id.test33_03);
        RadioButton num34_02 = rootview.findViewById(R.id.test34_02);
        RadioButton num35_03 = rootview.findViewById(R.id.test35_03);
        RadioButton num36_03 = rootview.findViewById(R.id.test36_03);
        RadioButton num37_03 = rootview.findViewById(R.id.test37_03);
        RadioButton num38_01 = rootview.findViewById(R.id.test38_01);
        RadioButton num39_03 = rootview.findViewById(R.id.test39_03);
        RadioButton num40_02 = rootview.findViewById(R.id.test40_02);


        // 이전문제
        exam01 = new WriteExam_2020_01_1();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container, exam01).commit();
            }
        });

        // 다음문제
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 정답
                if(num21_04.isChecked() && num22_01.isChecked() && num23_04.isChecked() && num24_02.isChecked() && num25_04.isChecked()
                        && num26_04.isChecked() && num27_02.isChecked() && num28_03.isChecked() && num29_01.isChecked() && num30_01.isChecked()
                        && num31_02.isChecked() && num32_04.isChecked() && num33_03.isChecked() && num34_02.isChecked() && num35_03.isChecked()
                        && num36_03.isChecked() && num37_03.isChecked() && num38_01.isChecked() && num39_03.isChecked() && num40_02.isChecked()
                ){
                    Toast.makeText(getContext(),"정답입니다.",Toast.LENGTH_SHORT).show();
                }

                // 오답
                if (num21_04.isChecked() == false){
                    TextView error21 = rootview.findViewById(R.id.error21);
                    error21.setVisibility(View.VISIBLE);
                }

                if (num22_01.isChecked() == false){
                    TextView error22 = rootview.findViewById(R.id.error22);
                    error22.setVisibility(View.VISIBLE);
                }

                if (num23_04.isChecked() == false){
                    TextView error23 = rootview.findViewById(R.id.error23);
                    error23.setVisibility(View.VISIBLE);
                }

                if (num24_02.isChecked() == false){
                    TextView error24 = rootview.findViewById(R.id.error24);
                    error24.setVisibility(View.VISIBLE);
                }

                if (num25_04.isChecked() == false){
                    TextView error25 = rootview.findViewById(R.id.error25);
                    error25.setVisibility(View.VISIBLE);
                }

                if (num26_04.isChecked() == false){
                    TextView error26 = rootview.findViewById(R.id.error26);
                    error26.setVisibility(View.VISIBLE);
                }

                if (num27_02.isChecked() == false){
                    TextView error27 = rootview.findViewById(R.id.error27);
                    error27.setVisibility(View.VISIBLE);
                }

                if (num28_03.isChecked() == false){
                    TextView error28 = rootview.findViewById(R.id.error28);
                    error28.setVisibility(View.VISIBLE);
                }
                if (num29_01.isChecked() == false){
                    TextView error29 = rootview.findViewById(R.id.error29);
                    error29.setVisibility(View.VISIBLE);
                }

                if (num30_01.isChecked() == false){
                    TextView error30 = rootview.findViewById(R.id.error30);
                    error30.setVisibility(View.VISIBLE);
                }

                if (num31_02.isChecked() == false){
                    TextView error31 = rootview.findViewById(R.id.error31);
                    error31.setVisibility(View.VISIBLE);
                }

                if (num32_04.isChecked() == false){
                    TextView error32 = rootview.findViewById(R.id.error32);
                    error32.setVisibility(View.VISIBLE);
                }

                if (num33_03.isChecked() == false){
                    TextView error33 = rootview.findViewById(R.id.error33);
                    error33.setVisibility(View.VISIBLE);
                }

                if (num34_02.isChecked() == false){
                    TextView error34 = rootview.findViewById(R.id.error34);
                    error34.setVisibility(View.VISIBLE);
                }

                if (num35_03.isChecked() == false){
                    TextView error35 = rootview.findViewById(R.id.error35);
                    error35.setVisibility(View.VISIBLE);
                }

                if (num36_03.isChecked() == false){
                    TextView error36 = rootview.findViewById(R.id.error36);
                    error36.setVisibility(View.VISIBLE);
                }

                if (num37_03.isChecked() == false){
                    TextView error37 = rootview.findViewById(R.id.error37);
                    error37.setVisibility(View.VISIBLE);
                }

                if (num38_01.isChecked() == false){
                    TextView error38 = rootview.findViewById(R.id.error38);
                    error38.setVisibility(View.VISIBLE);
                }

                if (num39_03.isChecked() == false){
                    TextView error39 = rootview.findViewById(R.id.error39);
                    error39.setVisibility(View.VISIBLE);
                }

                if (num40_02.isChecked() == false){
                    TextView error40 = rootview.findViewById(R.id.error40);
                    error40.setVisibility(View.VISIBLE);
                }

            }
        });

        return rootview;
    }
}