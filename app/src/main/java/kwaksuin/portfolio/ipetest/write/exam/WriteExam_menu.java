package kwaksuin.portfolio.ipetest.write.exam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import kwaksuin.portfolio.ipetest.R;

public class WriteExam_menu extends Fragment {
    WriteExam_2020_01_1 exam01;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.writeexam_menu, container, false);


        // 제 1,2회 필기 문제
        exam01 = new WriteExam_2020_01_1();
        TextView test01 = rootview.findViewById(R.id.exam01);
        test01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,exam01).commit();
            }
        });

        // 제 3회 필기 문제
        TextView test02 = rootview.findViewById(R.id.exam02);
        test02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        // 제 4회 필기 문제
        TextView test03 = rootview.findViewById(R.id.exam03);
        test03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
       return rootview;
    }
}