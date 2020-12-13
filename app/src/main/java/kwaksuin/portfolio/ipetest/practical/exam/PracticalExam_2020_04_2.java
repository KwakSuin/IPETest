package kwaksuin.portfolio.ipetest.practical.exam;

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

// 2020년도 제 4, 5회 실기 7 ~ 11 문제
public class PracticalExam_2020_04_2 extends Fragment {
    PracticalExam_2020_04_1 page01;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical_exam_2020_04_2, container, false);

        EditText answer07 = rootview.findViewById(R.id.answer07);
        EditText answer08 = rootview.findViewById(R.id.answer08);
        EditText answer09 = rootview.findViewById(R.id.answer09);
        EditText answer10 = rootview.findViewById(R.id.answer10);
        EditText answer11 = rootview.findViewById(R.id.answer11);

        // 확인
        Button end = rootview.findViewById(R.id.end);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((answer07.getText().toString().equals("하둡") || answer07.getText().toString().equals("Hadoop") || answer07.getText().toString().equals("hadoop"))
                        && (answer08.getText().toString().equals("삽입이상, 갱신이상, 삭제이상") || answer08.getText().toString().equals("삽입이상, 삭제이상, 갱신이상")
                        || answer08.getText().toString().equals("갱신이상, 삽입이상, 삭제이상") || answer08.getText().toString().equals("갱신이상, 삭제이상, 삽입이상")
                        || answer08.getText().toString().equals("삭제이상, 갱신이상, 삽입이상") || answer08.getText().toString().equals("삭제이상, 삽입이상, 갱신이상"))
                        && (answer09.getText().toString().equals("준비, 실행, 대기") || answer09.getText().toString().equals("준비 실행 대기"))
                        && answer10.getText().toString().equals("샘플링 오라클")
                        && answer11.getText().toString().equals("권한을 가진 사용자나 애플리케이션이 원하는 서비스를 지속적으로 사용할 수 있도록 보장하는 특성")
                ){
                    Toast.makeText(getContext(),"정답입니다. 수고하셨습니다.",Toast.LENGTH_LONG).show();
                }
            }
        });

        // 이전 문제
        page01 = new PracticalExam_2020_04_1();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page01).commit();
            }
        });


        // hint 효과
        // AlphaAnimation = 투명도 조절(0.0 ~ 1.0)
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(1.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(1000);

        // 7번 문제 정답
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

        // 8번 문제 정답
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


        // 9번 문제 정답
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


        // 10번 문제 정답
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


        // 11번 문제 정답
        Button hint11_bt = rootview.findViewById(R.id.hint11_bt);
        TextView hint11 = rootview.findViewById(R.id.hint11);
        hint11_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint11.setVisibility(View.VISIBLE);
                hint11.startAnimation(animation);
                hint11.setVisibility(View.INVISIBLE);
            }
        });


        return rootview;
    }
}