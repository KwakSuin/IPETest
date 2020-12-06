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

// 실기 26 ~30 문제
public class Practical50_06 extends Fragment {
    Practical50_05 page05;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.practical50_06,container,false);

        EditText answer26 = rootView.findViewById(R.id.answer26);
        EditText answer27 = rootView.findViewById(R.id.answer27);
        EditText answer28 = rootView.findViewById(R.id.answer28);
        EditText answer29 = rootView.findViewById(R.id.answer29);
        EditText answer30 = rootView.findViewById(R.id.answer30);

        // 다음 문제
        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            // 트리거, 화이트박스테스트, DRM, GIT, 테스트케이스
            @Override
            public void onClick(View v) {
                if((answer26.getText().toString().equals("트리거") || answer26.getText().toString().equals("Trigger") || answer26.getText().toString().equals("trigger"))
                        && (answer27.getText().toString().equals("화이트박스 테스트") || answer27.getText().toString().equals("Whitebox Test"))
                        && answer28.getText().toString().equals("DRM")
                        && answer29.getText().toString().equals("Git")
                        && (answer30.getText().toString().equals("테스트 케이스") || answer30.getText().toString().equals("테스트케이스"))

                ){
                    Toast.makeText(getContext(),"정답입니다.",Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 이전 문제
        page05 = new Practical50_05();
        Button back = rootView.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page05).commit();
            }
        });

        return rootView;
    }
}