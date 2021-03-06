package kwaksuin.portfolio.ipetest.write.problem50;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import kwaksuin.portfolio.ipetest.R;

// 필기 객관식 50문제 1 ~ 5번 문제
public class Write50_01 extends Fragment {
    Write50_02 page02;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.write50_01,container,false);

        page02 = new Write50_02();

        // 정답
        RadioButton num01_01 = rootView.findViewById(R.id.test01_01);
        RadioButton num02_04 = rootView.findViewById(R.id.test02_04);
        RadioButton num03_04 = rootView.findViewById(R.id.test03_04);
        RadioButton num04_02 = rootView.findViewById(R.id.test04_02);
        RadioButton num05_04 = rootView.findViewById(R.id.test05_04);

        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 정답일 때, 다음페이지 이동
                if(num01_01.isChecked() && num02_04.isChecked() && num03_04.isChecked() && num04_02.isChecked() && num05_04.isChecked() ){

                    getFragmentManager().beginTransaction().replace(R.id.container, page02).commit();

                }

                // 오답
                if(num01_01.isChecked()== false){
                    TextView error01 = rootView.findViewById(R.id.error01);
                    error01.setVisibility(View.VISIBLE);
                }

                if(num02_04.isChecked()== false){
                    TextView error02 = rootView.findViewById(R.id.error02);
                    error02.setVisibility(View.VISIBLE);
                }

                if(num03_04.isChecked()== false){
                    TextView error03 = rootView.findViewById(R.id.error03);
                    error03.setVisibility(View.VISIBLE);
                }

                if(num04_02.isChecked()== false){
                    TextView error04 = rootView.findViewById(R.id.error04);
                    error04.setVisibility(View.VISIBLE);
                }

                if(num05_04.isChecked()== false){
                    TextView error05 = rootView.findViewById(R.id.error05);
                    error05.setVisibility(View.VISIBLE);
                }
            }
        });
        return rootView;

    }
}