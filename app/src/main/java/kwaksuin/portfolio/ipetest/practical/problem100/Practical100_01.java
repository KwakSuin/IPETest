package kwaksuin.portfolio.ipetest.practical.problem100;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import kwaksuin.portfolio.ipetest.R;

// 실기 100문제 단답형 1 ~ 10번
public class Practical100_01 extends Fragment {
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical100_01, container, false);

        EditText answer01 = rootview.findViewById(R.id.answer01);
        EditText answer02 = rootview.findViewById(R.id.answer02);
        EditText answer03 = rootview.findViewById(R.id.answer03);
        EditText answer04 = rootview.findViewById(R.id.answer04);
        EditText answer05 = rootview.findViewById(R.id.answer05);
        EditText answer06 = rootview.findViewById(R.id.answer06);
        EditText answer07 = rootview.findViewById(R.id.answer07);
        EditText answer08 = rootview.findViewById(R.id.answer08);
        EditText answer09 = rootview.findViewById(R.id.answer09);
        EditText answer10 = rootview.findViewById(R.id.answer10);

        // 다음 문제
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer01.getText().toString().equals("병행 테스트")
                        && answer02.getText().toString().equals("세션하이재킹")
                        && answer03.getText().toString().equals("API")
                        && answer04.getText().toString().equals("VPN")
                        && answer05.getText().toString().equals("교착상태")
                        && answer06.getText().toString().equals("이상 현상")
                        && answer07.getText().toString().equals("블랙박스 테스트")
                        && (answer08.getText().toString().equals("XSS") || answer08.getText().toString().equals("크로스 사이트 스크립트"))
                        && answer09.getText().toString().equals("IPv4")
                        && answer10.getText().toString().equals("ERD")
                ) {
                    Toast.makeText(getContext(),"정답입니다.",Toast.LENGTH_LONG).show();
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

        // 2번 정답 확인하기
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

        // 3번 정답 확인하기
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

        // 4번 정답 확인하기
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

        // 5번 정답 확인하기
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

        // 6번 정답 확인하기
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

        // 7번 정답 확인하기
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

        // 8번 정답 확인하기
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

        // 9번 정답 확인하기
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

        // 10번 정답 확인하기
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