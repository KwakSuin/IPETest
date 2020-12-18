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
import android.widget.Toast;

import kwaksuin.portfolio.ipetest.R;

// 2020년 제 2회 실기 11 ~ 15번 문제
public class PracticalExam_2020_02_3 extends Fragment {
    PracticalExam_2020_02_2 page02;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical_exam_2020_02_3, container, false);

        EditText answer11 = rootview.findViewById(R.id.answer11);
        EditText answer12 = rootview.findViewById(R.id.answer12);
        EditText answer13 = rootview.findViewById(R.id.answer13);
        EditText answer14 = rootview.findViewById(R.id.answer14);
        EditText answer15 = rootview.findViewById(R.id.answer15);

        // 정답 확인
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer11.getText().toString().equals("유효성")
                        && answer12.getText().toString().equals("chmod 751 a.txt")
                        && (answer13.getText().toString().equals("Linked Open Data") || answer13.getText().toString().equals("linked open data"))
                        && (answer14.getText().toString().equals("개념적설계, 논리적설계, 물리적설계") || answer14.getText().toString().equals("개념적 설계, 논리적 설계, 물리적 설계"))
                        && (answer15.getText().toString().equals("형상관리") || answer15.getText().toString().equals("형상 관리"))

                ){
                    Toast.makeText(getContext(),"정답입니다. 수고하셨습니다.",Toast.LENGTH_LONG).show();
                }

            }
        });


        // 이전 문제
        page02 = new PracticalExam_2020_02_2();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page02).commit();
            }
        });

        // hint 효과
        // AlphaAnimation = 투명도 조절(0.0 ~ 1.0)
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(1.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(1000);

        // 11번 문제 정답
        Button hint11_bt = rootview.findViewById(R.id.hint11_bt);
        TextView hint11 = rootview.findViewById(R.id.hint11);
        hint11_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint11.setVisibility(View.VISIBLE);
                hint11.startAnimation(animation);
                hint11.setVisibility(View.INVISIBLE);
            }
        });

        // 12번 문제 정답
        Button hint12_bt = rootview.findViewById(R.id.hint12_bt);
        TextView hint12 = rootview.findViewById(R.id.hint12);
        hint12_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint12.setVisibility(View.VISIBLE);
                hint12.startAnimation(animation);
                hint12.setVisibility(View.INVISIBLE);
            }
        });

        // 13번 문제 정답
        Button hint13_bt = rootview.findViewById(R.id.hint13_bt);
        TextView hint13 = rootview.findViewById(R.id.hint13);
        hint13_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint13.setVisibility(View.VISIBLE);
                hint13.startAnimation(animation);
                hint13.setVisibility(View.INVISIBLE);
            }
        });

        // 14번 문제 정답
        Button hint14_bt = rootview.findViewById(R.id.hint14_bt);
        TextView hint14 = rootview.findViewById(R.id.hint14);
        hint14_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint14.setVisibility(View.VISIBLE);
                hint14.startAnimation(animation);
                hint14.setVisibility(View.INVISIBLE);
            }
        });

        // 15번 문제 정답
        Button hint15_bt = rootview.findViewById(R.id.hint15_bt);
        TextView hint15 = rootview.findViewById(R.id.hint15);
        hint15_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint15.setVisibility(View.VISIBLE);
                hint15.startAnimation(animation);
                hint15.setVisibility(View.INVISIBLE);
            }
        });


        return rootview;
    }
}