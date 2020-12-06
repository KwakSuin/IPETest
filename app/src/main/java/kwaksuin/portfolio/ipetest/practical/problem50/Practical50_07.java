package kwaksuin.portfolio.ipetest.practical.problem50;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import kwaksuin.portfolio.ipetest.R;

// 실기 31 ~ 35 문제
public class Practical50_07 extends Fragment {
    Practical50_06 page06;
    Practical50_08 page08;

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
        return  rootview;
    }
}