package kwaksuin.portfolio.ipetest.practical.problem50;

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

// 실기 1 ~ 5번 문제
public class Practical50_01 extends Fragment {
    Practical50_02 page02;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.practical50_01,container,false);

        EditText answer01 = rootView.findViewById(R.id.answer01);
        EditText answer02 = rootView.findViewById(R.id.answer02);
        EditText answer03 = rootView.findViewById(R.id.answer03);
        EditText answer04 = rootView.findViewById(R.id.answer04);
        EditText answer05 = rootView.findViewById(R.id.answer05);

        // 다음 문제
        page02 = new Practical50_02();
        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((answer01.getText().toString().equals("클래스다이어그램") || answer01.getText().toString().equals("클래스 다이어그램"))
                        && (answer02.getText().toString().equals("시퀀스다이어그램") || answer02.getText().toString().equals("시퀀스 다이어그램"))
                        && answer03.getText().toString().equals("라우터")
                        && answer04.getText().toString().equals("스위치")
                        && answer05.getText().toString().equals("JDBC")
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container, page02).commit();

                }

                // 1번 오답
                if(answer01.getText().toString().equals("클래스다이어그램") || answer01.getText().toString().equals("클래스다이어그램") || answer01.getText().toString().equals("Class Diagram") == false){
                    TextView error01 = rootView.findViewById(R.id.error01);
                    error01.setVisibility(View.VISIBLE);

                }

                // 2번 오답
                if(answer02.getText().toString().equals("시퀀스다이어그램") || answer02.getText().toString().equals("시퀀스 다이어그램") == false){
                    TextView error02 = rootView.findViewById(R.id.error02);
                    error02.setVisibility(View.VISIBLE);

                }

                // 3번 오답
                if(answer03.getText().toString().equals("라우터") == false){
                    TextView error03 = rootView.findViewById(R.id.error03);
                    error03.setVisibility(View.VISIBLE);

                }

                // 4번 오답
                if(answer04.getText().toString().equals("스위치") == false){
                    TextView error04 = rootView.findViewById(R.id.error04);
                    error04.setVisibility(View.VISIBLE);

                }

                // 5번 오답
                if(answer05.getText().toString().equals("JDBC") == false){
                    TextView error05 = rootView.findViewById(R.id.error05);
                    error05.setVisibility(View.VISIBLE);

                }
            }
        });

        // hint 효과
        // AlphaAnimation = 투명도 조절
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(20);

        // 1번 정답 확인하기
        Button hint01_bt = rootView.findViewById(R.id.hint01_bt);
        TextView hint01 = rootView.findViewById(R.id.hint01);
        hint01_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint01.setVisibility(View.VISIBLE);
                hint01.startAnimation(animation);
                hint01.setVisibility(View.INVISIBLE);
            }
        });

        // 2번 정답 확인하기
        Button hint02_bt = rootView.findViewById(R.id.hint02_bt);
        TextView hint02 = rootView.findViewById(R.id.hint02);
        hint02_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint02.setVisibility(View.VISIBLE);
                hint02.startAnimation(animation);
                hint02.setVisibility(View.INVISIBLE);
                
            }
        });
        
        // 3번 정답 확인하기
        Button hint03_bt = rootView.findViewById(R.id.hint03_bt);
        TextView hint03 = rootView.findViewById(R.id.hint03);
        hint03_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint03.setVisibility(View.VISIBLE);
                hint03.startAnimation(animation);
                hint03.setVisibility(View.INVISIBLE);
            }
        });

        // 4번 정답 확인하기
        Button hint04_bt = rootView.findViewById(R.id.hint04_bt);
        TextView hint04 = rootView.findViewById(R.id.hint04);
        hint04_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint04.setVisibility(View.VISIBLE);
                hint04.startAnimation(animation);
                hint04.setVisibility(View.INVISIBLE);
            }
        });

        // 5번 정답 확인하기
        Button hint05_bt = rootView.findViewById(R.id.hint05_bt);
        TextView hint05 = rootView.findViewById(R.id.hint05);
        hint05_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint05.setVisibility(View.VISIBLE);
                hint05.startAnimation(animation);
                hint05.setVisibility(View.INVISIBLE);
            }
        });

        return rootView;
    }
}