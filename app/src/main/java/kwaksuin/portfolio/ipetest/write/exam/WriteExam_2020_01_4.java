package kwaksuin.portfolio.ipetest.write.exam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import kwaksuin.portfolio.ipetest.R;

public class WriteExam_2020_01_4 extends Fragment {
    WriteExam_2020_01_3 exam03;
    WriteExam_2020_01_5 exam05;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.writeexam_2020_01_4, container, false);

        // 정답
        RadioButton num61_03 = rootview.findViewById(R.id.test61_03);
        RadioButton num62_02 = rootview.findViewById(R.id.test62_02);
        RadioButton num63_04 = rootview.findViewById(R.id.test63_04);
        RadioButton num64_03 = rootview.findViewById(R.id.test64_03);
        RadioButton num65_01 = rootview.findViewById(R.id.test65_01);
        RadioButton num66_04 = rootview.findViewById(R.id.test66_04);
        RadioButton num67_04 = rootview.findViewById(R.id.test67_04);
        RadioButton num68_01 = rootview.findViewById(R.id.test68_01);
        RadioButton num69_03 = rootview.findViewById(R.id.test69_03);
        RadioButton num70_02 = rootview.findViewById(R.id.test70_02);

        RadioButton num71_03 = rootview.findViewById(R.id.test71_03);
        RadioButton num72_01 = rootview.findViewById(R.id.test72_01);
        RadioButton num73_04 = rootview.findViewById(R.id.test72_04);
        RadioButton num74_04 = rootview.findViewById(R.id.test73_04);
        RadioButton num75_02 = rootview.findViewById(R.id.test75_02);
        RadioButton num76_02 = rootview.findViewById(R.id.test76_02);
        RadioButton num77_02 = rootview.findViewById(R.id.test77_02);
        RadioButton num78_01 = rootview.findViewById(R.id.test78_01);
        RadioButton num79_04 = rootview.findViewById(R.id.test79_04);
        RadioButton num80_03 = rootview.findViewById(R.id.test80_03);

        // 이전 문제
        exam03 = new WriteExam_2020_01_3();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,exam03).commit();
            }
        });

        // 다음 문제
        exam05 = new WriteExam_2020_01_5();
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num61_03.isChecked() && num62_02.isChecked() && num63_04.isChecked() && num64_03.isChecked() && num65_01.isChecked()
                        && num66_04.isChecked() && num67_04.isChecked() && num68_01.isChecked() && num69_03.isChecked() && num70_02.isChecked()
                        && num71_03.isChecked() && num72_01.isChecked() && num73_04.isChecked() && num74_04.isChecked() && num75_02.isChecked()
                        && num76_02.isChecked() && num77_02.isChecked() && num78_01.isChecked() && num79_04.isChecked() && num80_03.isChecked()
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,exam05).commit();
                }
                
                // 오답
                if(num61_03.isChecked() == false){
                    TextView error61 = rootview.findViewById(R.id.error61);
                    error61.setVisibility(View.VISIBLE);
                }

                if(num62_02.isChecked() == false){
                    TextView error62 = rootview.findViewById(R.id.error62);
                    error62.setVisibility(View.VISIBLE);
                }

                if(num63_04.isChecked() == false){
                    TextView error63 = rootview.findViewById(R.id.error63);
                    error63.setVisibility(View.VISIBLE);
                }

                if(num64_03.isChecked() == false){
                    TextView error64 = rootview.findViewById(R.id.error64);
                    error64.setVisibility(View.VISIBLE);
                }

                if(num65_01.isChecked() == false){
                    TextView error65 = rootview.findViewById(R.id.error65);
                    error65.setVisibility(View.VISIBLE);
                }

                if(num66_04.isChecked() == false){
                    TextView error66 = rootview.findViewById(R.id.error66);
                    error66.setVisibility(View.VISIBLE);
                }

                if(num67_04.isChecked() == false){
                    TextView error67 = rootview.findViewById(R.id.error67);
                    error67.setVisibility(View.VISIBLE);
                }

                if(num68_01.isChecked() == false){
                    TextView error68 = rootview.findViewById(R.id.error68);
                    error68.setVisibility(View.VISIBLE);
                }

                if(num69_03.isChecked() == false){
                    TextView error69 = rootview.findViewById(R.id.error69);
                    error69.setVisibility(View.VISIBLE);
                }

                if(num70_02.isChecked() == false){
                    TextView error70 = rootview.findViewById(R.id.error70);
                    error70.setVisibility(View.VISIBLE);
                }

                if(num71_03.isChecked() == false){
                    TextView error71 = rootview.findViewById(R.id.error71);
                    error71.setVisibility(View.VISIBLE);
                }

                if(num72_01.isChecked() == false){
                    TextView error72 = rootview.findViewById(R.id.error72);
                    error72.setVisibility(View.VISIBLE);
                }

                if(num73_04.isChecked() == false){
                    TextView error73 = rootview.findViewById(R.id.error73);
                    error73.setVisibility(View.VISIBLE);
                }

                if(num74_04.isChecked() == false){
                    TextView error74 = rootview.findViewById(R.id.error74);
                    error74.setVisibility(View.VISIBLE);
                }

                if(num75_02.isChecked() == false){
                    TextView error75 = rootview.findViewById(R.id.error75);
                    error75.setVisibility(View.VISIBLE);
                }

                if(num76_02.isChecked() == false){
                    TextView error76 = rootview.findViewById(R.id.error76);
                    error76.setVisibility(View.VISIBLE);
                }

                if(num77_02.isChecked() == false){
                    TextView error77 = rootview.findViewById(R.id.error77);
                    error77.setVisibility(View.VISIBLE);
                }

                if(num78_01.isChecked() == false){
                    TextView error78 = rootview.findViewById(R.id.error78);
                    error78.setVisibility(View.VISIBLE);
                }

                if(num79_04.isChecked() == false){
                    TextView error79 = rootview.findViewById(R.id.error79);
                    error79.setVisibility(View.VISIBLE);
                }

                if(num80_03.isChecked() == false){
                    TextView error80 = rootview.findViewById(R.id.error80);
                    error80.setVisibility(View.VISIBLE);
                }

            }
        });

        return rootview;
    }
}