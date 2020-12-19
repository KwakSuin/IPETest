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

// 실기 6 ~ 10번 문제
public class Practical50_02 extends Fragment {
    Practical50_01 page01;
    Practical50_03 page03;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.practical50_02,container,false);

        EditText answer06 = rootView.findViewById(R.id.answer06);
        EditText answer07 = rootView.findViewById(R.id.answer07);
        EditText answer08 = rootView.findViewById(R.id.answer08);
        EditText answer09 = rootView.findViewById(R.id.answer09);
        EditText answer10 = rootView.findViewById(R.id.answer10);

        page03 = new Practical50_03();
        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((answer06.getText().toString().equals("UI") || answer06.getText().toString().equals("User Interface"))
                        && answer07.getText().toString().equals("UML")
                        && answer08.getText().toString().equals("UX")
                        && (answer09.getText().toString().equals("사용성 테스트") || answer09.getText().toString().equals("사용성테스트"))
                        && (answer10.getText().toString().equals("와이어 프레임") || answer10.getText().toString().equals("와이어프레임"))
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page03).commit();
                }
                
                // 6번 오답
                if(answer06.getText().toString().equals("UI") || answer06.getText().toString().equals("User Interface") == false){
                    TextView error06 = rootView.findViewById(R.id.error06);
                    error06.setVisibility(View.VISIBLE);
                }

                // 6번 오답
                if(answer07.getText().toString().equals("UML") == false){
                    TextView error07 = rootView.findViewById(R.id.error07);
                    error07.setVisibility(View.VISIBLE);
                }

                // 8번 오답
                if(answer08.getText().toString().equals("UX") == false){
                    TextView error08 = rootView.findViewById(R.id.error08);
                    error08.setVisibility(View.VISIBLE);
                }

                // 9번 오답
                if(answer09.getText().toString().equals("사용성 테스트") || answer09.getText().toString().equals("사용성테스트") == false){
                    TextView error09 = rootView.findViewById(R.id.error09);
                    error09.setVisibility(View.VISIBLE);
                }

                // 10번 오답
                if(answer10.getText().toString().equals("와이어 프레임") || answer10.getText().toString().equals("와이어프레임") == false){
                    TextView error10 = rootView.findViewById(R.id.error10);
                    error10.setVisibility(View.VISIBLE);
                }

            }
        });
        
        // 이전 문제
        page01 = new Practical50_01();
        Button back = rootView.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container, page01).commit();
            }
        });

        // hint 효과
        // AlphaAnimation = 투명도 조절
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(20);
        
        // 6번 문제 정답
        Button hint06_bt = rootView.findViewById(R.id.hint06_bt);
        TextView hint06 = rootView.findViewById(R.id.hint06);
        hint06_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint06.setVisibility(View.VISIBLE);
                hint06.startAnimation(animation);
                hint06.setVisibility(View.INVISIBLE);
            }
        });

        // 7번 문제 정답
        Button hint07_bt = rootView.findViewById(R.id.hint07_bt);
        TextView hint07 = rootView.findViewById(R.id.hint07);
        hint07_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint07.setVisibility(View.VISIBLE);
                hint07.startAnimation(animation);
                hint07.setVisibility(View.INVISIBLE);
            }
        });

        // 8번 문제 정답
        Button hint08_bt = rootView.findViewById(R.id.hint08_bt);
        TextView hint08 = rootView.findViewById(R.id.hint08);
        hint08_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint08.setVisibility(View.VISIBLE);
                hint08.startAnimation(animation);
                hint08.setVisibility(View.INVISIBLE);
            }
        });

        // 9번 문제 정답
        Button hint09_bt = rootView.findViewById(R.id.hint09_bt);
        TextView hint09 = rootView.findViewById(R.id.hint09);
        hint09_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint09.setVisibility(View.VISIBLE);
                hint09.startAnimation(animation);
                hint09.setVisibility(View.INVISIBLE);
            }
        });

        // 10번 문제 정답
        Button hint10_bt = rootView.findViewById(R.id.hint10_bt);
        TextView hint10 = rootView.findViewById(R.id.hint10);
        hint10_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint10.setVisibility(View.VISIBLE);
                hint10.startAnimation(animation);
                hint10.setVisibility(View.INVISIBLE);
            }
        });

        return rootView;
    }
}