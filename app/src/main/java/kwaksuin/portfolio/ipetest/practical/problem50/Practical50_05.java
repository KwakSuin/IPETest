package kwaksuin.portfolio.ipetest.practical.problem50;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import kwaksuin.portfolio.ipetest.R;

// 실기 21 ~ 25 문제
public class Practical50_05 extends Fragment {
    Practical50_04 page04;
    Practical50_06 page06;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.practical50_05,container,false);

        EditText answer21 = rootView.findViewById(R.id.answer21);
        EditText answer22 = rootView.findViewById(R.id.answer22);
        EditText answer23 = rootView.findViewById(R.id.answer23);
        EditText answer24 = rootView.findViewById(R.id.answer24);
        EditText answer25 = rootView.findViewById(R.id.answer25);

        // 다음 문제
        page06 = new Practical50_06();
        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            // 워크스루, 인스펙션, EAI, ESB, 트랜잭션
            public void onClick(View v) {
                if ((answer21.getText().toString().equals("워크스루") || answer21.getText().toString().equals("워크 스루"))
                        && answer22.getText().toString().equals("인스펙션")
                        && answer23.getText().toString().equals("EAI")
                        && answer24.getText().toString().equals("ESB")
                        && (answer25.getText().toString().equals("트랜잭션") || answer25.getText().toString().equals("Transaction"))
                ) {
                    getFragmentManager().beginTransaction().replace(R.id.container,page06).commit();
                }
            }
        });

        // 이전 문제
        page04 = new Practical50_04();
        Button back = rootView.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page04).commit();
            }
        });

        return rootView;
    }
}