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

import org.w3c.dom.Text;

import kwaksuin.portfolio.ipetest.R;

// 2020년 제 1회 실기시험 문제 (코드제외) 1 ~ 7번 문제
public class PracticalExam_2020_01_1 extends Fragment {
    Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical_exam_2020_01, container, false);

        EditText answer01 = rootview.findViewById(R.id.answer01);
        EditText answer02 = rootview.findViewById(R.id.answer02);
        EditText answer03 = rootview.findViewById(R.id.answer03);
        EditText answer04 = rootview.findViewById(R.id.answer04);
        EditText answer05 = rootview.findViewById(R.id.answer05);
        EditText answer06 = rootview.findViewById(R.id.answer06);
        EditText answer07 = rootview.findViewById(R.id.answer07);

        // 다음 문제
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer01.getText().toString().equals("애플리케이션 테스트중 동일한 테스트 케이스를 지속적으로 반복하면 추가 결함을 발견할 수 없게 된다.")
                        && answer02.getText().toString().equals("데이터웨어하우징에서 수집되고 분석된 자료를 사용자에게 제공하기 위해 분류 및 가공되는 요소기술이다.")
                        && (answer03.getText().toString().equals("구문, 의미, 타이밍") || answer03.getText().toString().equals("구문 의미 타이밍"))
                        && answer04.getText().toString().equals("XML")
                        && answer05.getText().toString().equals("JSON")
                        && answer06.getText().toString().equals("(대기 시간+서비스 시간)/서비스 시간")
                        && (answer07.getText().toString().equals("원자성, 독립성") || answer07.getText().toString().equals("원자성 독립성")
                        || answer07.getText().toString().equals("독립성, 원자성") || answer07.getText().toString().equals("독립성 원자성"))

                ){
                    Toast.makeText(getContext(),"정답입니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        // hint 효과
        // AlphaAnimation = 투명도 조절
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(20);

        // 1번 문제 정답
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

        return  rootview;
    }
}