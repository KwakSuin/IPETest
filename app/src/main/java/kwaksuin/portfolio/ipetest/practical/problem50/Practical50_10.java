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


public class Practical50_10 extends Fragment {
    Practical50_09 page09;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical50_10,container,false);

        EditText answer46 = rootview.findViewById(R.id.answer46);
        EditText answer47 = rootview.findViewById(R.id.answer47);
        EditText answer48 = rootview.findViewById(R.id.answer48);
        EditText answer49 = rootview.findViewById(R.id.answer49);
        EditText answer50 = rootview.findViewById(R.id.answer50);

        // 종료
        Button end = rootview.findViewById(R.id.end);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TCP, WAS, 기밀성/가용성/무결성, 검증/확인, 미들웨어
                if(answer46.getText().toString().equals("TCP")
                        && answer47.getText().toString().equals("WAS")
                        && (answer48.getText().toString().equals("기밀성, 가용성, 무결성") || answer48.getText().toString().equals("기밀성 가용성 무결성") || answer48.getText().toString().equals("기밀성/가용성/무결성"))
                        && (answer49.getText().toString().equals("검증, 확인") || answer49.getText().toString().equals("검증 확인") || answer49.getText().toString().equals("검증/확인"))
                        && answer50.getText().toString().equals("미들웨어")
                ){
                    Toast.makeText(getContext(),"정답입니다. 수고하셨습니다.",Toast.LENGTH_LONG).show();
                }
            }
        });

        // 이전 문제
        page09 = new Practical50_09();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page09).commit();
            }
        });

        // hint 효과
        // AlphaAnimation = 투명도 조절
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(20);

        // 46 문제 정답
        Button hint46_bt = rootview.findViewById(R.id.hint46_bt);
        TextView hint46 = rootview.findViewById(R.id.hint46);
        hint46_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint46.setVisibility(View.VISIBLE);
                hint46.startAnimation(animation);
                hint46.setTextColor(View.INVISIBLE);
            }
        });

        // 47 문제 정답
        Button hint47_bt = rootview.findViewById(R.id.hint47_bt);
        TextView hint47 = rootview.findViewById(R.id.hint47);
        hint47_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint47.setVisibility(View.VISIBLE);
                hint47.startAnimation(animation);
                hint47.setTextColor(View.INVISIBLE);
            }
        });

        // 48 문제 정답
        Button hint48_bt = rootview.findViewById(R.id.hint48_bt);
        TextView hint48 = rootview.findViewById(R.id.hint48);
        hint48_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint48.setVisibility(View.VISIBLE);
                hint48.startAnimation(animation);
                hint48.setTextColor(View.INVISIBLE);
            }
        });

        // 49 문제 정답
        Button hint49_bt = rootview.findViewById(R.id.hint49_bt);
        TextView hint49 = rootview.findViewById(R.id.hint49);
        hint49_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint49.setVisibility(View.VISIBLE);
                hint49.startAnimation(animation);
                hint49.setTextColor(View.INVISIBLE);
            }
        });

        // 50 문제 정답
        Button hint50_bt = rootview.findViewById(R.id.hint50_bt);
        TextView hint50 = rootview.findViewById(R.id.hint50);
        hint50_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint50.setVisibility(View.VISIBLE);
                hint50.startAnimation(animation);
                hint50.setTextColor(View.INVISIBLE);
            }
        });

        return  rootview;
    }
}