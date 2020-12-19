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

// 실기 31 ~ 35번 문제
public class Practical50_07 extends Fragment {
    Practical50_06 page06;
    Practical50_08 page08;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical50_07,container,false);

        EditText answer31 = rootview.findViewById(R.id.answer31);
        EditText answer32 = rootview.findViewById(R.id.answer32);
        EditText answer33 = rootview.findViewById(R.id.answer33);
        EditText answer34 = rootview.findViewById(R.id.answer34);
        EditText answer35 = rootview.findViewById(R.id.answer35);

        // 다음 문제
        page08 = new Practical50_08();
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 테스트 시나리오, 결함 집중, 오류 부재의 궤변, 빅뱅 통합 테스트, 스텁
                if(answer31.getText().toString().equals("테스트 스나리오")
                        && (answer32.getText().toString().equals("결합집중") || answer32.getText().toString().equals("결합 집중"))
                        && (answer33.getText().toString().equals("오류-부재의 궤변") || answer33.getText().toString().equals("오류부재의 궤변") || answer33.getText().toString().equals("오류 부재의 궤변"))
                        && answer34.getText().toString().equals("빅뱅 통합 테스트")
                        && (answer35.getText().toString().equals("스텁") || answer35.getText().toString().equals("stub"))
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page08).commit();
                }

                // 31번 오답
                if(answer31.getText().toString().equals("테스트 스나리오") == false){
                    TextView error31 = rootview.findViewById(R.id.error31);
                    error31.setVisibility(View.VISIBLE);
                }

                // 32번 오답
                if(answer32.getText().toString().equals("결합집중") || answer32.getText().toString().equals("결합 집중") == false){
                    TextView error32 = rootview.findViewById(R.id.error32);
                    error32.setVisibility(View.VISIBLE);
                }

                // 33번 오답
                if(answer33.getText().toString().equals("오류-부재의 궤변") || answer33.getText().toString().equals("오류부재의 궤변") || answer33.getText().toString().equals("오류 부재의 궤변") == false){
                    TextView error33 = rootview.findViewById(R.id.error33);
                    error33.setVisibility(View.VISIBLE);
                }

                // 34번 오답
                if(answer34.getText().toString().equals("빅뱅 통합 테스트") == false){
                    TextView error34 = rootview.findViewById(R.id.error34);
                    error34.setVisibility(View.VISIBLE);
                }

                // 35번 오답
                if(answer35.getText().toString().equals("스텁") || answer35.getText().toString().equals("stub") == false){
                    TextView error35 = rootview.findViewById(R.id.error35);
                    error35.setVisibility(View.VISIBLE);
                }

            }
        });

        // 이전 문제
        page06 = new Practical50_06();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page06).commit();
            }
        });

        // hint 효과
        // AlphaAnimation = 투명도 조절
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(20);

        // 31번 문제 정답
        Button hint31_bt = rootview.findViewById(R.id.hint31_bt);
        TextView hint31 = rootview.findViewById(R.id.hint31);
        hint31_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint31.setVisibility(View.VISIBLE);
                hint31.startAnimation(animation);
                hint31.setTextColor(View.INVISIBLE);
            }
        });

        // 32번 문제 정답
        Button hint32_bt = rootview.findViewById(R.id.hint32_bt);
        TextView hint32 = rootview.findViewById(R.id.hint32);
        hint32_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint32.setVisibility(View.VISIBLE);
                hint32.startAnimation(animation);
                hint32.setTextColor(View.INVISIBLE);
            }
        });

        // 33번 문제 정답
        Button hint33_bt = rootview.findViewById(R.id.hint33_bt);
        TextView hint33 = rootview.findViewById(R.id.hint33);
        hint33_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint33.setVisibility(View.VISIBLE);
                hint33.startAnimation(animation);
                hint33.setTextColor(View.INVISIBLE);
            }
        });

        // 34번 문제 정답
        Button hint34_bt = rootview.findViewById(R.id.hint34_bt);
        TextView hint34 = rootview.findViewById(R.id.hint34);
        hint34_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint34.setVisibility(View.VISIBLE);
                hint34.startAnimation(animation);
                hint34.setTextColor(View.INVISIBLE);
            }
        });

        // 35번 문제 정답
        Button hint35_bt = rootview.findViewById(R.id.hint35_bt);
        TextView hint35 = rootview.findViewById(R.id.hint35);
        hint35_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint35.setVisibility(View.VISIBLE);
                hint35.startAnimation(animation);
                hint35.setTextColor(View.INVISIBLE);
            }
        });


        return  rootview;
    }
}