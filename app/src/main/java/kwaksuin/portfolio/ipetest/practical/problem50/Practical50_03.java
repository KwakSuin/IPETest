package kwaksuin.portfolio.ipetest.practical.problem50;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import kwaksuin.portfolio.ipetest.R;

public class Practical50_03 extends Fragment {
    Practical50_02 page02;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.practical50_03,container,false);

        EditText answer11 = rootView.findViewById(R.id.answer11);
        EditText answer12 = rootView.findViewById(R.id.answer12);
        EditText answer13 = rootView.findViewById(R.id.answer13);
        EditText answer14 = rootView.findViewById(R.id.answer14);
        EditText answer15 = rootView.findViewById(R.id.answer15);

        // 다음 문제
        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer11.getText().toString().equals("스토리보드")
                        && answer12.getText().toString().equals("프로토타입")
                        && (answer13.getText().toString().equals("유스케이스") || answer13.getText().toString().equals("UseCase"))
                        && answer14.getText().toString().equals("모듈화")
                        && answer15.getText().toString().equals("소프트웨어 아키텍처")
                ){
                    Toast.makeText(getContext(),"정답입니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 이전 문제
        page02 = new Practical50_02();
        Button back = rootView.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page02).commit();
            }
        });
        
        return rootView;
    }
}