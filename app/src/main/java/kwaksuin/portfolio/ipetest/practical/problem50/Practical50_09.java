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

// 실기 41 ~ 45번 문제
public class Practical50_09 extends Fragment {
    Practical50_08 page08;
    Practical50_10 page10;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical50_09,container,false);

        EditText answer41 = rootview.findViewById(R.id.answer41);
        EditText answer42 = rootview.findViewById(R.id.answer42);
        EditText answer43 = rootview.findViewById(R.id.answer43);
        EditText answer44 = rootview.findViewById(R.id.answer44);
        EditText answer45 = rootview.findViewById(R.id.answer45);

        // 다음 문제
        page10 = new Practical50_10();
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // WSDL, UDDI, CSRF, 회귀 테스트, SSO
                if (answer41.getText().toString().equals("WSDL")
                        && answer42.getText().toString().equals("UDDI")
                        && answer43.getText().toString().equals("CSRF")
                        && (answer44.getText().toString().equals("회귀 테스트") || answer44.getText().toString().equals("회귀테스트"))
                        && answer45.getText().toString().equals("SSO")
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page10).commit();
                }

                // 41번 오답
                if(answer41.getText().toString().equals("WSDL") == false){
                    TextView error41 = rootview.findViewById(R.id.error41);
                    error41.setVisibility(View.VISIBLE);
                }

                // 42번 오답
                if(answer42.getText().toString().equals("UDDI") == false){
                    TextView error42 = rootview.findViewById(R.id.error42);
                    error42.setVisibility(View.VISIBLE);
                }

                // 43번 오답
                if(answer43.getText().toString().equals("CSRF") == false){
                    TextView error43 = rootview.findViewById(R.id.error43);
                    error43.setVisibility(View.VISIBLE);
                }

                // 44번 오답
                if(answer44.getText().toString().equals("회귀 테스트") || answer44.getText().toString().equals("회귀테스트") == false){
                    TextView error44 = rootview.findViewById(R.id.error44);
                    error44.setVisibility(View.VISIBLE);
                }

                // 45번 오답
                if(answer45.getText().toString().equals("SSO") == false){
                    TextView error45 = rootview.findViewById(R.id.error45);
                    error45.setVisibility(View.VISIBLE);
                }
            }
        });

        // 이전 문제
        page08 = new Practical50_08();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container, page08).commit();
            }
        });

        // hint 효과
        // AlphaAnimation = 투명도 조절
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(20);

        // 41 문제 정답
        Button hint41_bt = rootview.findViewById(R.id.hint41_bt);
        TextView hint41 = rootview.findViewById(R.id.hint41);
        hint41_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint41.setVisibility(View.VISIBLE);
                hint41.startAnimation(animation);
                hint41.setTextColor(View.INVISIBLE);
            }
        });

        // 42 문제 정답
        Button hint42_bt = rootview.findViewById(R.id.hint42_bt);
        TextView hint42 = rootview.findViewById(R.id.hint42);
        hint42_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint42.setVisibility(View.VISIBLE);
                hint42.startAnimation(animation);
                hint42.setTextColor(View.INVISIBLE);
            }
        });

        // 43 문제 정답
        Button hint43_bt = rootview.findViewById(R.id.hint43_bt);
        TextView hint43 = rootview.findViewById(R.id.hint43);
        hint43_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint43.setVisibility(View.VISIBLE);
                hint43.startAnimation(animation);
                hint43.setTextColor(View.INVISIBLE);
            }
        });

        // 44 문제 정답
        Button hint44_bt = rootview.findViewById(R.id.hint44_bt);
        TextView hint44 = rootview.findViewById(R.id.hint44);
        hint44_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint44.setVisibility(View.VISIBLE);
                hint44.startAnimation(animation);
                hint44.setTextColor(View.INVISIBLE);
            }
        });

        // 45 문제 정답
        Button hint45_bt = rootview.findViewById(R.id.hint45_bt);
        TextView hint45 = rootview.findViewById(R.id.hint45);
        hint45_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint45.setVisibility(View.VISIBLE);
                hint45.startAnimation(animation);
                hint45.setTextColor(View.INVISIBLE);
            }
        });


        return  rootview;
    }
}