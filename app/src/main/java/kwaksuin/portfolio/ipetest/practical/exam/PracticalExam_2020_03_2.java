package kwaksuin.portfolio.ipetest.practical.exam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kwaksuin.portfolio.ipetest.R;

// 2020년 제 3회 실기 7 ~ 12번 문제
public class PracticalExam_2020_03_2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical_exam_2020_03_2, container, false);

        return rootview;
    }
}