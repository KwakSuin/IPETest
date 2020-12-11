package kwaksuin.portfolio.ipetest.practical.exam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kwaksuin.portfolio.ipetest.R;

// 2020년 제 3회 실기 1 ~ 6번 문제
public class PracticalExam_2020_03_1 extends Fragment {
    PracticalExam_2020_03_2 page02;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical_exam_2020_03_1, container, false);

        EditText answer01 = rootview.findViewById(R.id.answer01);
        EditText answer02 = rootview.findViewById(R.id.answer02);
        EditText answer03 = rootview.findViewById(R.id.answer03);
        EditText answer04 = rootview.findViewById(R.id.answer04);
        EditText answer05 = rootview.findViewById(R.id.answer05);
        EditText answer06 = rootview.findViewById(R.id.answer06);

        // 다음 문제
        page02 = new PracticalExam_2020_03_2();
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer01.getText().toString().equals("")
                        && answer02.getText().toString().equals("")
                        && answer03.getText().toString().equals("")
                        && answer04.getText().toString().equals("")
                        && answer05.getText().toString().equals("")
                        && answer06.getText().toString().equals("")

                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page02).commit();
                }

            }
        });


        // hint 효과
        // AlphaAnimation = 투명도 조절(0.0 ~ 1.0)
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(1.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(1000);

        // 1번 문제 정답
        Button hint01_bt = rootview.findViewById(R.id.hint01_bt);
        TextView hint01 = rootview.findViewById(R.id.hint01);
        hint01_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint01.setVisibility(View.VISIBLE);
                hint01.startAnimation(animation);
                hint01.setVisibility(View.INVISIBLE);
            }
        });

        // 2번 문제 정답
        Button hint02_bt = rootview.findViewById(R.id.hint02_bt);
        TextView hint02 = rootview.findViewById(R.id.hint02);
        hint02_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint02.setVisibility(View.VISIBLE);
                hint02.startAnimation(animation);
                hint02.setVisibility(View.INVISIBLE);
            }
        });

        // 3번 문제 정답
        Button hint03_bt = rootview.findViewById(R.id.hint03_bt);
        TextView hint03 = rootview.findViewById(R.id.hint03);
        hint03_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint03.setVisibility(View.VISIBLE);
                hint03.startAnimation(animation);
                hint03.setVisibility(View.INVISIBLE);
            }
        });

        // 4번 문제 정답
        Button hint04_bt = rootview.findViewById(R.id.hint04_bt);
        TextView hint04 = rootview.findViewById(R.id.hint04);
        hint04_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint04.setVisibility(View.VISIBLE);
                hint04.startAnimation(animation);
                hint04.setVisibility(View.INVISIBLE);
            }
        });

        // 5번 문제 정답
        Button hint05_bt = rootview.findViewById(R.id.hint05_bt);
        TextView hint05 = rootview.findViewById(R.id.hint05);
        hint05_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint05.setVisibility(View.VISIBLE);
                hint05.startAnimation(animation);
                hint05.setVisibility(View.INVISIBLE);
            }
        });

        // 6번 문제 정답
        Button hint06_bt = rootview.findViewById(R.id.hint06_bt);
        TextView hint06 = rootview.findViewById(R.id.hint06);
        hint06_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint06.setVisibility(View.VISIBLE);
                hint06.startAnimation(animation);
                hint06.setVisibility(View.INVISIBLE);
            }
        });

        return rootview;
    }
}