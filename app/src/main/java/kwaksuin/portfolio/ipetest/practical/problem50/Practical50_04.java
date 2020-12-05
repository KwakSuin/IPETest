package kwaksuin.portfolio.ipetest.practical.problem50;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import kwaksuin.portfolio.ipetest.R;

public class Practical50_04 extends Fragment {
    Practical50_03 page03;
    Practical50_05 page05;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.practical50_04,container,false);

        EditText answer16 = rootView.findViewById(R.id.answer16);
        EditText answer17 = rootView.findViewById(R.id.answer17);
        EditText answer18 = rootView.findViewById(R.id.answer18);
        EditText answer19 = rootView.findViewById(R.id.answer19);
        EditText answer20 = rootView.findViewById(R.id.answer20);

        // 다음문제
        page05 = new Practical50_05();
        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer16.getText().toString().equals("소프트웨어 아키텍처 4+1 view")
                        && answer17.getText().toString().equals("캡슐화")
                        && answer18.getText().toString().equals("추상화")
                        && (answer19.getText().toString().equals("기능적 요구사항") || answer19.getText().toString().equals("기능적요구사항"))
                        && (answer20.getText().toString().equals("비기능적 요구사항") || answer20.getText().toString().equals("비기능적요구사항"))
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page05).commit();
                }

            }
        });

        // 이전문제
        page03 = new Practical50_03();
        Button back = rootView.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page03).commit();
            }
        });

        return rootView;
    }
}