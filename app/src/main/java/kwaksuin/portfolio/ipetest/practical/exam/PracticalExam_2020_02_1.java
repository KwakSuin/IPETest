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

// 2020년 제 2회 실기 문제 1 ~ 5번
public class PracticalExam_2020_02_1 extends Fragment {
    PracticalExam_2020_02_2 page02;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.practical_exam_2020_02_1, container, false);

        EditText answer01 = rootview.findViewById(R.id.answer01);
        EditText answer02 = rootview.findViewById(R.id.answer02);
        EditText answer03 = rootview.findViewById(R.id.answer03);
        EditText answer04 = rootview.findViewById(R.id.answer04);
        EditText answer05 = rootview.findViewById(R.id.answer05);

        // 다음 문제
        page02 = new PracticalExam_2020_02_2();
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((answer01.getText().toString().equals("재해복구시간") || answer01.getText().toString().equals("RTO") || answer01.getText().toString().equals("Recovery Time Objective"))
                        && (answer02.getText().toString().equals("비동기 통신기법") || answer02.getText().toString().equals("AJAX") || answer02.getText().toString().equals("Asynchronous JavaScript and XML"))
                        && (answer03.getText().toString().equals("애자일") || answer03.getText().toString().equals("애자일 방법론") || answer03.getText().toString().equals("Agile") || answer03.getText().toString().equals("에자일"))
                        && answer04.getText().toString().equals("트랜잭션 실패 시 작업을 취소하고 트랜잭션 실행 이전으로 되돌리는 명령어")
                        && answer05.getText().toString().equals("IPSec")
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

        return  rootview;
    }
}