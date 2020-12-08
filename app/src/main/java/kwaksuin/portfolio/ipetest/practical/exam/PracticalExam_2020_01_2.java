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

// 2020년 제 1회 실기시험 문제 (코드제외) 8 ~ 14번 문제
public class PracticalExam_2020_01_2 extends Fragment {
    PracticalExam_2020_01_1 page01;
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical_exam_2020_01_2, container, false);

        EditText answer08 = rootview.findViewById(R.id.answer08);
        EditText answer09 = rootview.findViewById(R.id.answer09);
        EditText answer10 = rootview.findViewById(R.id.answer10);
        EditText answer11 = rootview.findViewById(R.id.answer11);
        EditText answer12 = rootview.findViewById(R.id.answer12);
        EditText answer13 = rootview.findViewById(R.id.answer13);
        EditText answer14 = rootview.findViewById(R.id.answer14);

        // 확인
        Button end = rootview.findViewById(R.id.end);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((answer08.getText().toString().equals("랜드어택") || answer08.getText().toString().equals("Land Attack"))
                        && answer09.getText().toString().equals("MD5")
                        && (answer10.getText().toString().equals("결합도, 응집도") || answer10.getText().toString().equals("결합도 응집도"))
                        && answer11.getText().toString().equals("30000/5*300 = 20개월")
                        && answer12.getText().toString().equals("물리계층")

                ){
                    Toast.makeText(getContext(),"정답입니다. 수고하셨습니다.",Toast.LENGTH_LONG).show();
                }

            }
        });


        // 이전 문제
        page01 = new PracticalExam_2020_01_1();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page01).commit();
            }
        });

        // hint 효과
        // AlphaAnimation = 투명도 조절(최소 0.0 ~ 최대 1.0)
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(1.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(1000);

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

        // 12번 문제 정답
        Button hint12_bt = rootview.findViewById(R.id.hint12_bt);
        TextView hint12 = rootview.findViewById(R.id.hint12);
        hint12_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint12.setVisibility(View.VISIBLE);
                hint12.startAnimation(animation);
                hint12.setVisibility(View.INVISIBLE);
            }
        });

        // 13번 문제 정답
        Button hint13_bt = rootview.findViewById(R.id.hint13_bt);
        TextView hint13 = rootview.findViewById(R.id.hint13);
        hint13_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint13.setVisibility(View.VISIBLE);
                hint13.startAnimation(animation);
                hint13.setVisibility(View.INVISIBLE);
            }
        });

        // 14번 문제 정답
        Button hint14_bt = rootview.findViewById(R.id.hint14_bt);
        TextView hint14 = rootview.findViewById(R.id.hint14);
        hint14_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint14.setVisibility(View.VISIBLE);
                hint14.startAnimation(animation);
                hint14.setVisibility(View.INVISIBLE);
            }
        });


        return rootview;
    }
}