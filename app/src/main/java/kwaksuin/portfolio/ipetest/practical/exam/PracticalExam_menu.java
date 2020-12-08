package kwaksuin.portfolio.ipetest.practical.exam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import kwaksuin.portfolio.ipetest.R;

public class PracticalExam_menu extends Fragment {
    PracticalExam_2020_01_1 exam2020_01;
    PracticalExam_2020_02_1 exam2020_02;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical_exam_menu, container, false);

        // 2020년 제 1회 실기
        exam2020_01 = new PracticalExam_2020_01_1();
        TextView exam01 = rootview.findViewById(R.id.exam01);
        exam01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,exam2020_01).commit();
            }
        });

        // 2020년 제 2회 실기
        exam2020_02 = new PracticalExam_2020_02_1();
        TextView exam02 = rootview.findViewById(R.id.exam02);
        exam02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,exam2020_02).commit();
            }
        });


        return rootview;
    }
}