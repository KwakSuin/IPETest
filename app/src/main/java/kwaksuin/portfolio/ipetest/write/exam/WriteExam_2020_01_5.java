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

public class WriteExam_2020_01_5 extends Fragment {
    WriteExam_2020_01_4 exam04;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.writeexam_2020_01_5, container, false);

        // 정답
        RadioButton num81_01 = rootview.findViewById(R.id.test81_01);
        RadioButton num82_04 = rootview.findViewById(R.id.test82_04);
        RadioButton num83_02 = rootview.findViewById(R.id.test83_02);
        RadioButton num84_04 = rootview.findViewById(R.id.test84_04);
        RadioButton num85_04 = rootview.findViewById(R.id.test85_04);
        RadioButton num86_03 = rootview.findViewById(R.id.test86_03);
        RadioButton num87_02 = rootview.findViewById(R.id.test87_02);
        RadioButton num88_02 = rootview.findViewById(R.id.test88_02);
        RadioButton num89_02 = rootview.findViewById(R.id.test89_02);
        RadioButton num90_01 = rootview.findViewById(R.id.test90_01);

        RadioButton num91_01 = rootview.findViewById(R.id.test91_01);
        RadioButton num92_01 = rootview.findViewById(R.id.test92_01);
        RadioButton num93_01 = rootview.findViewById(R.id.test93_01);
        RadioButton num94_01 = rootview.findViewById(R.id.test94_01);
        RadioButton num95_01 = rootview.findViewById(R.id.test95_01);
        RadioButton num96_01 = rootview.findViewById(R.id.test96_01);
        RadioButton num97_03 = rootview.findViewById(R.id.test97_03);
        RadioButton num98_01 = rootview.findViewById(R.id.test98_01);
        RadioButton num99_04 = rootview.findViewById(R.id.test99_04);
        RadioButton num100_4 = rootview.findViewById(R.id.test100_04);

        // 이전 문제
        exam04 = new WriteExam_2020_01_4();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,exam04).commit();
            }
        });

        // 정답 확인
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num81_01.isChecked() && num82_04.isChecked() && num83_02.isChecked() && num84_04.isChecked() && num85_04.isChecked()
                        && num86_03.isChecked() && num87_02.isChecked() && num88_02.isChecked() && num89_02.isChecked() && num90_01.isChecked()
                        && num91_01.isChecked() && num92_01.isChecked() && num93_01.isChecked() && num84_04.isChecked() && num95_01.isChecked()
                        && num96_01.isChecked() && num97_03.isChecked() && num98_01.isChecked() && num99_04.isChecked() && num100_4.isChecked()
                ){
                    Toast.makeText(getContext(),"정답입니다. 수고하셨습니다.",Toast.LENGTH_LONG).show();
                }

                // 오답
                if(num81_01.isChecked() == false){
                    TextView error81 = rootview.findViewById(R.id.error81);
                    error81.setVisibility(View.VISIBLE);
                }

                if(num82_04.isChecked() == false){
                    TextView error82 = rootview.findViewById(R.id.error82);
                    error82.setVisibility(View.VISIBLE);
                }

                if(num83_02.isChecked() == false){
                    TextView error83 = rootview.findViewById(R.id.error83);
                    error83.setVisibility(View.VISIBLE);
                }

                if(num84_04.isChecked() == false){
                    TextView error84 = rootview.findViewById(R.id.error84);
                    error84.setVisibility(View.VISIBLE);
                }

                if(num85_04.isChecked() == false){
                    TextView error85 = rootview.findViewById(R.id.error85);
                    error85.setVisibility(View.VISIBLE);
                }

                if(num86_03.isChecked() == false){
                    TextView error86 = rootview.findViewById(R.id.error86);
                    error86.setVisibility(View.VISIBLE);
                }

                if(num87_02.isChecked() == false){
                    TextView error87 = rootview.findViewById(R.id.error87);
                    error87.setVisibility(View.VISIBLE);
                }

                if(num88_02.isChecked() == false){
                    TextView error88 = rootview.findViewById(R.id.error88);
                    error88.setVisibility(View.VISIBLE);
                }

                if(num89_02.isChecked() == false){
                    TextView error89 = rootview.findViewById(R.id.error89);
                    error89.setVisibility(View.VISIBLE);
                }

                if(num90_01.isChecked() == false){
                    TextView error90 = rootview.findViewById(R.id.error90);
                    error90.setVisibility(View.VISIBLE);
                }

                if(num91_01.isChecked() == false){
                    TextView error91 = rootview.findViewById(R.id.error91);
                    error91.setVisibility(View.VISIBLE);
                }

                if(num92_01.isChecked() == false){
                    TextView error92 = rootview.findViewById(R.id.error92);
                    error92.setVisibility(View.VISIBLE);
                }

                if(num93_01.isChecked() == false){
                    TextView error93 = rootview.findViewById(R.id.error93);
                    error93.setVisibility(View.VISIBLE);
                }

                if(num94_01.isChecked() == false){
                    TextView error94 = rootview.findViewById(R.id.error94);
                    error94.setVisibility(View.VISIBLE);
                }

                if(num95_01.isChecked() == false){
                    TextView error95 = rootview.findViewById(R.id.error95);
                    error95.setVisibility(View.VISIBLE);
                }

                if(num96_01.isChecked() == false){
                    TextView error96 = rootview.findViewById(R.id.error96);
                    error96.setVisibility(View.VISIBLE);
                }

                if(num97_03.isChecked() == false){
                    TextView error97 = rootview.findViewById(R.id.error97);
                    error97.setVisibility(View.VISIBLE);
                }

                if(num98_01.isChecked() == false){
                    TextView error98 = rootview.findViewById(R.id.error98);
                    error98.setVisibility(View.VISIBLE);
                }

                if(num99_04.isChecked() == false){
                    TextView error99 = rootview.findViewById(R.id.error99);
                    error99.setVisibility(View.VISIBLE);
                }

                if(num100_4.isChecked() == false){
                    TextView error100 = rootview.findViewById(R.id.error100);
                    error100.setVisibility(View.VISIBLE);
                }


            }
        });

        return rootview;
    }
}