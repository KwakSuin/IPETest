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

// 2020년 제 2회 실기 6 ~ 10번 문제
public class PracticalExam_2020_02_2 extends Fragment {
    PracticalExam_2020_02_1 page01;
    PracticalExam_2020_02_3 page03;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical_exam_2020_02_2, container, false);

        EditText answer06 = rootview.findViewById(R.id.answer06);
        EditText answer07 = rootview.findViewById(R.id.answer07);
        EditText answer08 = rootview.findViewById(R.id.answer08);
        EditText answer09 = rootview.findViewById(R.id.answer09);
        EditText answer10 = rootview.findViewById(R.id.answer10);

        // 다음 문제
        page03 = new PracticalExam_2020_02_3();
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer06.getText().toString().equals("정적 분석 도구")
                        && (answer07.getText().toString().equals("Observer") || answer07.getText().toString().equals("Observer Pattern"))
                        && (answer08.getText().toString().equals("안드로이드") || answer08.getText().toString().equals("Android") || answer08.getText().toString().equals("android"))
                        && answer09.getText().toString().equals("SOAP")
                        && answer10.getText().toString().equals("응용프로그램의 보안 취약점을 이용해서 악의적인 SQL 구문을 삽입, 실행시켜서 데이터베이스(DB)의 접근을 통해 정보를 탈취하거나 조작 등의 행위를 하는 공격기법이다.")

                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page03).commit();
                }
            }
        });


        // 이전 문제
        page01 = new PracticalExam_2020_02_1();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page01).commit();
            }
        });


        // hint 효과
        // AlphaAnimation = 투명도 조절(0.0 ~ 1.0)
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(1.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(1000);

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

        // 7번 문제 정답
        Button hint07_bt = rootview.findViewById(R.id.hint07_bt);
        TextView hint07 = rootview.findViewById(R.id.hint07);
        hint07_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint07.setVisibility(View.VISIBLE);
                hint07.startAnimation(animation);
                hint07.setVisibility(View.INVISIBLE);
            }
        });

        // 8번 문제 정답
        Button hint08_bt = rootview.findViewById(R.id.hint08_bt);
        TextView hint08 = rootview.findViewById(R.id.hint08);
        hint08_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint08.setVisibility(View.VISIBLE);
                hint08.startAnimation(animation);
                hint08.setVisibility(View.INVISIBLE);
            }
        });

        // 9번 문제 정답
        Button hint09_bt = rootview.findViewById(R.id.hint09_bt);
        TextView hint09 = rootview.findViewById(R.id.hint09);
        hint09_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint09.setVisibility(View.VISIBLE);
                hint09.startAnimation(animation);
                hint09.setVisibility(View.INVISIBLE);
            }
        });

        // 10번 문제 정답
        Button hint10_bt = rootview.findViewById(R.id.hint10_bt);
        TextView hint10 = rootview.findViewById(R.id.hint10);
        hint10_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint10.setVisibility(View.VISIBLE);
                hint10.startAnimation(animation);
                hint10.setVisibility(View.INVISIBLE);
            }
        });

        return rootview;
    }
}