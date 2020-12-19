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


// 실기 36 ~ 40번 문제
public class Practical50_08 extends Fragment {
    Practical50_07 page07;
    Practical50_09 page09;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical50_08,container,false);

        EditText answer36 = rootview.findViewById(R.id.answer36);
        EditText answer37 = rootview.findViewById(R.id.answer37);
        EditText answer38 = rootview.findViewById(R.id.answer38);
        EditText answer39 = rootview.findViewById(R.id.answer39);
        EditText answer40 = rootview.findViewById(R.id.answer40);
        
        
        // 다음 문제
        page09 = new Practical50_09();
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 드라이버, 클린코드, 허브앤스포크,메시지버스, 느슨한결합
                if((answer36.getText().toString().equals("드라이버") || answer36.getText().toString().equals("driver"))
                        && (answer37.getText().toString().equals("클린코드") || answer37.getText().toString().equals("클린 코드"))
                        && (answer38.getText().toString().equals("허브 앤 스포크") || answer38.getText().toString().equals("Hub & Spoke") || answer38.getText().toString().equals("hub & spoke"))
                        && (answer39.getText().toString().equals("메시지버스") || answer39.getText().toString().equals("메시지 버스") || answer39.getText().toString().equals("Message Bus") || answer39.getText().toString().equals("message bus"))
                        && (answer40.getText().toString().equals("느슨한 결합") || answer40.getText().toString().equals("loose coupling"))
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page09).commit();
                }
                
                // 36번 오답
                if(answer36.getText().toString().equals("드라이버") || answer36.getText().toString().equals("driver") == false){
                    TextView error36 = rootview.findViewById(R.id.error36);
                    error36.setVisibility(View.VISIBLE);
                }

                // 37번 오답
                if(answer37.getText().toString().equals("클린코드") || answer37.getText().toString().equals("클린 코드") == false){
                    TextView error37 = rootview.findViewById(R.id.error37);
                    error37.setVisibility(View.VISIBLE);
                }

                // 38번 오답
                if(answer38.getText().toString().equals("허브 앤 스포크") || answer38.getText().toString().equals("Hub & Spoke") || answer38.getText().toString().equals("hub & spoke") == false){
                    TextView error38 = rootview.findViewById(R.id.error38);
                    error38.setVisibility(View.VISIBLE);
                }

                // 39번 오답
                if(answer39.getText().toString().equals("메시지버스") || answer39.getText().toString().equals("메시지 버스") || answer39.getText().toString().equals("Message Bus") || answer39.getText().toString().equals("message bus") == false){
                    TextView error39 = rootview.findViewById(R.id.error39);
                    error39.setVisibility(View.VISIBLE);
                }

                // 40번 오답
                if(answer40.getText().toString().equals("느슨한 결합") || answer40.getText().toString().equals("loose coupling") == false){
                    TextView error40 = rootview.findViewById(R.id.error40);
                    error40.setVisibility(View.VISIBLE);
                }
            }
        });


        // 이전 문제
        page07 = new Practical50_07();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page07).commit();
            }
        });

        // hint 효과
        // AlphaAnimation = 투명도 조절
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(20);

        // 36 문제 정답
        Button hint36_bt = rootview.findViewById(R.id.hint36_bt);
        TextView hint36 = rootview.findViewById(R.id.hint36);
        hint36_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint36.setVisibility(View.VISIBLE);
                hint36.startAnimation(animation);
                hint36.setTextColor(View.INVISIBLE);
            }
        });

        // 37 문제 정답
        Button hint37_bt = rootview.findViewById(R.id.hint37_bt);
        TextView hint37 = rootview.findViewById(R.id.hint37);
        hint37_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint37.setVisibility(View.VISIBLE);
                hint37.startAnimation(animation);
                hint37.setTextColor(View.INVISIBLE);
            }
        });

        // 38 문제 정답
        Button hint38_bt = rootview.findViewById(R.id.hint38_bt);
        TextView hint38 = rootview.findViewById(R.id.hint38);
        hint38_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint38.setVisibility(View.VISIBLE);
                hint38.startAnimation(animation);
                hint38.setTextColor(View.INVISIBLE);
            }
        });

        // 39 문제 정답
        Button hint39_bt = rootview.findViewById(R.id.hint39_bt);
        TextView hint39 = rootview.findViewById(R.id.hint39);
        hint39_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint39.setVisibility(View.VISIBLE);
                hint39.startAnimation(animation);
                hint39.setTextColor(View.INVISIBLE);
            }
        });

        // 40 문제 정답
        Button hint40_bt = rootview.findViewById(R.id.hint40_bt);
        TextView hint40 = rootview.findViewById(R.id.hint40);
        hint40_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint40.setVisibility(View.VISIBLE);
                hint40.startAnimation(animation);
                hint40.setTextColor(View.INVISIBLE);
            }
        });

        return  rootview;
    }
}