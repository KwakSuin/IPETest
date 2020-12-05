package kwaksuin.portfolio.ipetest.practical.problem50;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import kwaksuin.portfolio.ipetest.R;

public class Practical50_02 extends Fragment {
    Practical50_01 page01;
    Practical50_03 page03;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.practical50_02,container,false);

        EditText answer06 = rootView.findViewById(R.id.answer06);
        EditText answer07 = rootView.findViewById(R.id.answer07);
        EditText answer08 = rootView.findViewById(R.id.answer08);
        EditText answer09 = rootView.findViewById(R.id.answer09);
        EditText answer10 = rootView.findViewById(R.id.answer10);

        page03 = new Practical50_03();
        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((answer06.getText().toString().equals("UI") || answer06.getText().toString().equals("User Interface"))
                        && answer07.getText().toString().equals("UML")
                        && answer08.getText().toString().equals("UX")
                        && (answer09.getText().toString().equals("사용성 테스트") || answer09.getText().toString().equals("사용성테스트"))
                        && (answer10.getText().toString().equals("와이어 프레임") || answer10.getText().toString().equals("와이어프레임"))
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page03).commit();
                }
            }
        });
        
        // 이전 문제
        page01 = new Practical50_01();
        Button back = rootView.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container, page01).commit();
            }
        });

        return rootView;
    }
}