package kwaksuin.portfolio.ipetest.practical.problem50;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kwaksuin.portfolio.ipetest.R;


public class Practical50_01 extends Fragment {
    Practical50_02 page02;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.practical50_01,container,false);

        EditText answer01 = rootView.findViewById(R.id.answer01);
        EditText answer02 = rootView.findViewById(R.id.answer02);
        EditText answer03 = rootView.findViewById(R.id.answer03);
        EditText answer04 = rootView.findViewById(R.id.answer04);
        EditText answer05 = rootView.findViewById(R.id.answer05);

        page02 = new Practical50_02();
        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((answer01.getText().toString().equals("클래스다이어그램") || answer01.getText().toString().equals("클래스 다이어그램"))
                        && (answer02.getText().toString().equals("시퀀스다이어그램") || answer02.getText().toString().equals("시퀀스 다이어그램"))
                        && answer03.getText().toString().equals("라우터")
                        && answer04.getText().toString().equals("스위치")
                        && answer05.getText().toString().equals("JDBC")
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container, page02).commit();

                }else{
                    // 수정 할 부분 : 정답일 때, "오답" 같이 출력 됨
                    TextView error01 = rootView.findViewById(R.id.error01);
                    error01.setVisibility(View.VISIBLE);

                    TextView error02 = rootView.findViewById(R.id.error02);
                    error02.setVisibility(View.VISIBLE);

                    TextView error03 = rootView.findViewById(R.id.error03);
                    error03.setVisibility(View.VISIBLE);

                    TextView error04 = rootView.findViewById(R.id.error04);
                    error04.setVisibility(View.VISIBLE);

                    TextView error05 = rootView.findViewById(R.id.error05);
                    error05.setVisibility(View.VISIBLE);
                }
            }
        });

        return rootView;
    }
}