package kwaksuin.portfolio.ipetest.write.exam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import kwaksuin.portfolio.ipetest.R;

// 2020년 제 1, 2회 필기시험 1과목 1 ~ 20번 문제
public class WriteExam_2020_01_1 extends Fragment {
    WriteExam_2020_01_2 exam02;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.writeexam_2020_01_1, container, false);

        // 정답
        RadioButton num01_03 = rootview.findViewById(R.id.test01_03);
        RadioButton num02_03 = rootview.findViewById(R.id.test02_03);
        RadioButton num03_02 = rootview.findViewById(R.id.test03_02);
        RadioButton num04_04 = rootview.findViewById(R.id.test04_04);
        RadioButton num05_04 = rootview.findViewById(R.id.test05_04);
        RadioButton num06_01 = rootview.findViewById(R.id.test06_01);
        RadioButton num07_02 = rootview.findViewById(R.id.test07_02);
        RadioButton num08_02 = rootview.findViewById(R.id.test08_02);
        RadioButton num09_03 = rootview.findViewById(R.id.test09_03);
        RadioButton num10_02 = rootview.findViewById(R.id.test10_02);

        RadioButton num11_03 = rootview.findViewById(R.id.test11_03);
        RadioButton num12_03 = rootview.findViewById(R.id.test12_03);
        RadioButton num13_04 = rootview.findViewById(R.id.test13_04);
        RadioButton num14_01 = rootview.findViewById(R.id.test14_01);
        RadioButton num15_02 = rootview.findViewById(R.id.test15_02);
        RadioButton num16_03 = rootview.findViewById(R.id.test16_03);
        RadioButton num17_03 = rootview.findViewById(R.id.test17_03);
        RadioButton num18_03 = rootview.findViewById(R.id.test18_03);
        RadioButton num19_01 = rootview.findViewById(R.id.test19_01);
        RadioButton num20_01 = rootview.findViewById(R.id.test20_01);


        // 다음 문제
        exam02 = new WriteExam_2020_01_2();
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num01_03.isChecked() && num02_03.isChecked() && num03_02.isChecked() && num04_04.isChecked() && num05_04.isChecked()
                        && num06_01.isChecked() && num07_02.isChecked() && num08_02.isChecked() && num09_03.isChecked() && num10_02.isChecked()
                        && num11_03.isChecked() && num12_03.isChecked() && num13_04.isChecked() && num14_01.isChecked() && num15_02.isChecked()
                        && num16_03.isChecked() && num17_03.isChecked() && num18_03.isChecked() && num19_01.isChecked() && num20_01.isChecked()
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,exam02).commit();
                }
                
                // 오답 출력
                if(num01_03.isChecked() == false){
                    TextView error01 = rootview.findViewById(R.id.error01);
                    error01.setVisibility(View.VISIBLE);
                }

                if(num02_03.isChecked() == false){
                    TextView error02 = rootview.findViewById(R.id.error02);
                    error02.setVisibility(View.VISIBLE);
                }

                if(num03_02.isChecked() == false){
                    TextView error03 = rootview.findViewById(R.id.error03);
                    error03.setVisibility(View.VISIBLE);
                }

                if(num04_04.isChecked() == false){
                    TextView error04 = rootview.findViewById(R.id.error04);
                    error04.setVisibility(View.VISIBLE);
                }

                if(num05_04.isChecked() == false){
                    TextView error05 = rootview.findViewById(R.id.error05);
                    error05.setVisibility(View.VISIBLE);
                }

                if(num06_01.isChecked() == false){
                    TextView error06 = rootview.findViewById(R.id.error06);
                    error06.setVisibility(View.VISIBLE);
                }

                if(num07_02.isChecked() == false){
                    TextView error07 = rootview.findViewById(R.id.error07);
                    error07.setVisibility(View.VISIBLE);
                }

                if(num08_02.isChecked() == false){
                    TextView error08 = rootview.findViewById(R.id.error08);
                    error08.setVisibility(View.VISIBLE);
                }

                if(num09_03.isChecked() == false){
                    TextView error09 = rootview.findViewById(R.id.error09);
                    error09.setVisibility(View.VISIBLE);
                }

                if(num10_02.isChecked() == false){
                    TextView error10 = rootview.findViewById(R.id.error10);
                    error10.setVisibility(View.VISIBLE);
                }

                if(num11_03.isChecked() == false){
                    TextView error10 = rootview.findViewById(R.id.error10);
                    error10.setVisibility(View.VISIBLE);
                }

                if(num12_03.isChecked() == false){
                    TextView error12 = rootview.findViewById(R.id.error12);
                    error12.setVisibility(View.VISIBLE);
                }

                if(num13_04.isChecked() == false){
                    TextView error13 = rootview.findViewById(R.id.error13);
                    error13.setVisibility(View.VISIBLE);
                }

                if(num14_01.isChecked() == false){
                    TextView error14 = rootview.findViewById(R.id.error14);
                    error14.setVisibility(View.VISIBLE);
                }

                if(num15_02.isChecked() == false){
                    TextView error15 = rootview.findViewById(R.id.error15);
                    error15.setVisibility(View.VISIBLE);
                }

                if(num16_03.isChecked() == false){
                    TextView error16 = rootview.findViewById(R.id.error16);
                    error16.setVisibility(View.VISIBLE);
                }

                if(num17_03.isChecked() == false){
                    TextView error17 = rootview.findViewById(R.id.error17);
                    error17.setVisibility(View.VISIBLE);
                }

                if(num18_03.isChecked() == false){
                    TextView error18 = rootview.findViewById(R.id.error18);
                    error18.setVisibility(View.VISIBLE);
                }

                if(num19_01.isChecked() == false){
                    TextView error19 = rootview.findViewById(R.id.error19);
                    error19.setVisibility(View.VISIBLE);
                }

                if(num20_01.isChecked() == false){
                    TextView error20 = rootview.findViewById(R.id.error20);
                    error20.setVisibility(View.VISIBLE);
                }


            }
        });

        return rootview;
    }
}