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
import android.widget.Toast;

import kwaksuin.portfolio.ipetest.R;

// 실기 11 ~ 15번 문제
public class Practical50_03 extends Fragment {
    Practical50_02 page02;
    Practical50_04 page04;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.practical50_03,container,false);

        EditText answer11 = rootView.findViewById(R.id.answer11);
        EditText answer12 = rootView.findViewById(R.id.answer12);
        EditText answer13 = rootView.findViewById(R.id.answer13);
        EditText answer14 = rootView.findViewById(R.id.answer14);
        EditText answer15 = rootView.findViewById(R.id.answer15);

        // 다음 문제
        page04 = new Practical50_04();
        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer11.getText().toString().equals("스토리보드")
                        && answer12.getText().toString().equals("프로토타입")
                        && (answer13.getText().toString().equals("유스케이스") || answer13.getText().toString().equals("UseCase"))
                        && answer14.getText().toString().equals("모듈화")
                        && answer15.getText().toString().equals("소프트웨어 아키텍처")
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page04).commit();
                }
            }
        });

        // 이전 문제
        page02 = new Practical50_02();
        Button back = rootView.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page02).commit();
            }
        });

        // hint 효과
        // AlphaAnimation = 투명도 조절
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(20);

        // 11번 문제 정답
        Button hint11_bt = rootView.findViewById(R.id.hint11_bt);
        TextView hint11 = rootView.findViewById(R.id.hint11);
        hint11_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint11.setVisibility(View.VISIBLE);
                hint11.startAnimation(animation);
                hint11.setVisibility(View.INVISIBLE);
            }
        });

        // 12번 문제 정답
        Button hint12_bt = rootView.findViewById(R.id.hint12_bt);
        TextView hint12 = rootView.findViewById(R.id.hint12);
        hint12_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint12.setVisibility(View.VISIBLE);
                hint12.startAnimation(animation);
                hint12.setVisibility(View.INVISIBLE);
            }
        });

        // 13번 문제 정답
        Button hint13_bt = rootView.findViewById(R.id.hint13_bt);
        TextView hint13 = rootView.findViewById(R.id.hint13);
        hint13_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint13.setVisibility(View.VISIBLE);
                hint13.startAnimation(animation);
                hint13.setVisibility(View.INVISIBLE);
            }
        });

        // 14번 문제 정답
        Button hint14_bt = rootView.findViewById(R.id.hint14_bt);
        TextView hint14 = rootView.findViewById(R.id.hint14);
        hint14_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint14.setVisibility(View.VISIBLE);
                hint14.startAnimation(animation);
                hint14.setVisibility(View.INVISIBLE);
            }
        });

        // 15번 문제 정답
        Button hint15_bt = rootView.findViewById(R.id.hint15_bt);
        TextView hint15 = rootView.findViewById(R.id.hint15);
        hint15_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint15.setVisibility(View.VISIBLE);
                hint15.startAnimation(animation);
                hint15.setVisibility(View.INVISIBLE);
            }
        });
        
        return rootView;
    }
}