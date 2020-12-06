package kwaksuin.portfolio.ipetest.practical.problem50;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import kwaksuin.portfolio.ipetest.R;

// 실기 41 ~ 45번 문제
public class Practical50_09 extends Fragment {
    Practical50_08 page08;
    Practical50_10 page10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical50_09,container,false);

        EditText answer41 = rootview.findViewById(R.id.answer41);
        EditText answer42 = rootview.findViewById(R.id.answer42);
        EditText answer43 = rootview.findViewById(R.id.answer43);
        EditText answer44 = rootview.findViewById(R.id.answer44);
        EditText answer45 = rootview.findViewById(R.id.answer45);

        // 다음 문제
        page10 = new Practical50_10();
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // WSDL, UDDI, CSRF, 회귀 테스트, SSO
                if (answer41.getText().toString().equals("WSDL")
                        && answer42.getText().toString().equals("UDDI")
                        && answer43.getText().toString().equals("CSRF")
                        && (answer44.getText().toString().equals("회귀 테스트") || answer44.getText().toString().equals("회귀테스트"))
                        && answer45.getText().toString().equals("SSO")
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page10).commit();
                }
            }
        });

        // 이전 문제
        page08 = new Practical50_08();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container, page08).commit();
            }
        });
        return  rootview;
    }
}