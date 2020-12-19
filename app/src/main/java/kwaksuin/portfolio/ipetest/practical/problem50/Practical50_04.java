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

// 실기 16 ~ 20번 문제
public class Practical50_04 extends Fragment {
    Practical50_03 page03;
    Practical50_05 page05;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.practical50_04,container,false);

        EditText answer16 = rootView.findViewById(R.id.answer16);
        EditText answer17 = rootView.findViewById(R.id.answer17);
        EditText answer18 = rootView.findViewById(R.id.answer18);
        EditText answer19 = rootView.findViewById(R.id.answer19);
        EditText answer20 = rootView.findViewById(R.id.answer20);

        // 다음문제
        page05 = new Practical50_05();
        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer16.getText().toString().equals("소프트웨어 아키텍처 4+1 view")
                        && answer17.getText().toString().equals("캡슐화")
                        && answer18.getText().toString().equals("추상화")
                        && (answer19.getText().toString().equals("기능적 요구사항") || answer19.getText().toString().equals("기능적요구사항"))
                        && (answer20.getText().toString().equals("비기능적 요구사항") || answer20.getText().toString().equals("비기능적요구사항"))
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page05).commit();
                }

                // 16번 오답
                if(answer16.getText().toString().equals("소프트웨어 아키텍처 4+1 view") == false){
                    TextView error16 = rootView.findViewById(R.id.error16);
                    error16.setVisibility(View.VISIBLE);
                }

                // 17번 오답
                if(answer17.getText().toString().equals("캡슐화") == false){
                    TextView error17 = rootView.findViewById(R.id.error17);
                    error17.setVisibility(View.VISIBLE);
                }

                // 18번 오답
                if(answer18.getText().toString().equals("추상화") == false){
                    TextView error18 = rootView.findViewById(R.id.error18);
                    error18.setVisibility(View.VISIBLE);
                }

                // 19번 오답
                if(answer19.getText().toString().equals("기능적 요구사항") || answer19.getText().toString().equals("기능적요구사항") == false){
                    TextView error19 = rootView.findViewById(R.id.error19);
                    error19.setVisibility(View.VISIBLE);
                }

                // 20번 오답
                if(answer20.getText().toString().equals("비기능적 요구사항") || answer20.getText().toString().equals("비기능적요구사항") == false){
                    TextView error20 = rootView.findViewById(R.id.error20);
                    error20.setVisibility(View.VISIBLE);
                }

            }
        });

        // 이전문제
        page03 = new Practical50_03();
        Button back = rootView.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page03).commit();
            }
        });

        // hint 효과
        // AlphaAnimation = 투명도 조절
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(20);

        // 16번 문제 정답
        Button hint16_bt = rootView.findViewById(R.id.hint16_bt);
        TextView hint16 = rootView.findViewById(R.id.hint16);
        hint16_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint16.setVisibility(View.VISIBLE);
                hint16.startAnimation(animation);
                hint16.setVisibility(View.INVISIBLE);
            }
        });

        // 17번 문제 정답
        Button hint17_bt = rootView.findViewById(R.id.hint17_bt);
        TextView hint17 = rootView.findViewById(R.id.hint17);
        hint17_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint17.setVisibility(View.VISIBLE);
                hint17.startAnimation(animation);
                hint17.setVisibility(View.INVISIBLE);
            }
        });

        // 18번 문제 정답
        Button hint18_bt = rootView.findViewById(R.id.hint18_bt);
        TextView hint18 = rootView.findViewById(R.id.hint18);
        hint18_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint18.setVisibility(View.VISIBLE);
                hint18.startAnimation(animation);
                hint18.setVisibility(View.INVISIBLE);
            }
        });

        // 19번 문제 정답
        Button hint19_bt = rootView.findViewById(R.id.hint19_bt);
        TextView hint19 = rootView.findViewById(R.id.hint19);
        hint19_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint19.setVisibility(View.VISIBLE);
                hint19.startAnimation(animation);
                hint19.setVisibility(View.INVISIBLE);
            }
        });

        // 20번 문제 정답
        Button hint20_bt = rootView.findViewById(R.id.hint20_bt);
        TextView hint20 = rootView.findViewById(R.id.hint20);
        hint20_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint20.setVisibility(View.VISIBLE);
                hint20.startAnimation(animation);
                hint20.setVisibility(View.INVISIBLE);
            }
        });

        return rootView;
    }
}