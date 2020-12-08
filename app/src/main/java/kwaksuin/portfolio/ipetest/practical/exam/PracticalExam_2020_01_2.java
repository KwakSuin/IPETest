package kwaksuin.portfolio.ipetest.practical.exam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
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

        return rootview;
    }
}