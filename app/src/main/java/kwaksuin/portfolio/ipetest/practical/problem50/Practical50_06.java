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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import kwaksuin.portfolio.ipetest.R;

// 실기 26 ~30번 문제
public class Practical50_06 extends Fragment {
    Practical50_05 page05;
    Practical50_07 page07;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.practical50_06,container,false);

        EditText answer26 = rootView.findViewById(R.id.answer26);
        EditText answer27 = rootView.findViewById(R.id.answer27);
        EditText answer28 = rootView.findViewById(R.id.answer28);
        EditText answer29 = rootView.findViewById(R.id.answer29);
        EditText answer30 = rootView.findViewById(R.id.answer30);

        // 다음 문제
        page07 = new Practical50_07();
        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            // 트리거, 화이트박스테스트, DRM, GIT, 테스트케이스
            @Override
            public void onClick(View v) {
                if((answer26.getText().toString().equals("트리거") || answer26.getText().toString().equals("Trigger") || answer26.getText().toString().equals("trigger"))
                        && (answer27.getText().toString().equals("화이트박스 테스트") || answer27.getText().toString().equals("Whitebox Test"))
                        && answer28.getText().toString().equals("DRM")
                        && answer29.getText().toString().equals("Git")
                        && (answer30.getText().toString().equals("테스트 케이스") || answer30.getText().toString().equals("테스트케이스"))

                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page07).commit();
                }
            }
        });

        // 이전 문제
        page05 = new Practical50_05();
        Button back = rootView.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page05).commit();
            }
        });

        // hint 효과
        // AlphaAnimation = 투명도 조절
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(20);

        // 26번 문제 정답
        Button hint26_bt = rootView.findViewById(R.id.hint26_bt);
        TextView hint26 = rootView.findViewById(R.id.hint26);
        hint26_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint26.setVisibility(View.VISIBLE);
                hint26.startAnimation(animation);
                hint26.setTextColor(View.INVISIBLE);
            }
        });

        // 27번 문제 정답
        Button hint27_bt = rootView.findViewById(R.id.hint27_bt);
        TextView hint27 = rootView.findViewById(R.id.hint27);
        hint27_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint27.setVisibility(View.VISIBLE);
                hint27.startAnimation(animation);
                hint27.setTextColor(View.INVISIBLE);
            }
        });

        // 28번 문제 정답
        Button hint28_bt = rootView.findViewById(R.id.hint28_bt);
        TextView hint28 = rootView.findViewById(R.id.hint28);
        hint28_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint28.setVisibility(View.VISIBLE);
                hint28.startAnimation(animation);
                hint28.setTextColor(View.INVISIBLE);
            }
        });

        // 29번 문제 정답
        Button hint29_bt = rootView.findViewById(R.id.hint29_bt);
        TextView hint29 = rootView.findViewById(R.id.hint29);
        hint29_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint29.setVisibility(View.VISIBLE);
                hint29.startAnimation(animation);
                hint29.setTextColor(View.INVISIBLE);
            }
        });

        // 30번 문제 정답
        Button hint30_bt = rootView.findViewById(R.id.hint30_bt);
        TextView hint30 = rootView.findViewById(R.id.hint30);
        hint30_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint30.setVisibility(View.VISIBLE);
                hint30.startAnimation(animation);
                hint30.setTextColor(View.INVISIBLE);
            }
        });

        return rootView;
    }
}