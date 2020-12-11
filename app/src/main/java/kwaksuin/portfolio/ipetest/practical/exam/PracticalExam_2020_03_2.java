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

// 2020년 제 3회 실기 7 ~ 12번 문제
public class PracticalExam_2020_03_2 extends Fragment {
    PracticalExam_2020_03_1 page01;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical_exam_2020_03_2, container, false);

        EditText answer07 = rootview.findViewById(R.id.answer07);
        EditText answer08 = rootview.findViewById(R.id.answer08);
        EditText answer09 = rootview.findViewById(R.id.answer09);
        EditText answer10 = rootview.findViewById(R.id.answer10);
        EditText answer11 = rootview.findViewById(R.id.answer11);
        EditText answer12 = rootview.findViewById(R.id.answer12);

        // 확인
        Button end = rootview.findViewById(R.id.end);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((answer07.getText().toString().equals("블랙박스 테스트") || answer07.getText().toString().equals("블랙박스테스트") || answer07.getText().toString().equals("명세 기반 테스트") || answer07.getText().toString().equals("명세기반테스트"))
                        && answer08.getText().toString().equals("데이터베이스의 구조와 제약조건에 관한 전반적인 명세를 기술한 메타데이터의 집합")
                        && (answer09.getText().toString().equals("Point to Point, Hub & Spoke") || answer09.getText().toString().equals("Hub & Spoke, Point to Point") || answer09.getText().toString().equals("Hub&Spoke, Point to Point") || answer09.getText().toString().equals("Point to Point, Hub&Spoke"))
                        && answer10.getText().toString().equals("누구나 쉽게 이해하고, 쉽게 사용할 수 있어야 하고 쉬운 검색, 쉬운 사용성, 일관성의 부특성을 가지고 있는 UI 설계원칙")
                        && answer11.getText().toString().equals("객체 초기화 함수 객체 생성 시 자동호출되는 메소드")
                        && (answer12.getText().toString().equals("ALTER, ADD") || answer12.getText().toString().equals("ADD, ALTER"))

                ){
                    Toast.makeText(getContext(),"정답입니다. 수고하셨습니다.",Toast.LENGTH_LONG).show();
                }
            }
        });


        // 이전 문제
        page01 = new PracticalExam_2020_03_1();
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

        return rootview;
    }
}