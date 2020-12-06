package kwaksuin.portfolio.ipetest.practical.problem50;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import kwaksuin.portfolio.ipetest.R;


// 실기 36 ~ 40번 문제
public class Practical50_08 extends Fragment {
    Practical50_07 page07;
    Practical50_09 page09;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical50_08,container,false);

        EditText answer36 = rootview.findViewById(R.id.answer36);
        EditText answer37 = rootview.findViewById(R.id.answer37);
        EditText answer38 = rootview.findViewById(R.id.answer38);
        EditText answer39 = rootview.findViewById(R.id.answer39);
        EditText answer40 = rootview.findViewById(R.id.answer40);
        
        
        // 다음 문제
        page09 = new Practical50_09();
        Button next = rootview.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 드라이버, 클린코드, 허브앤스포크,메시지버스, 느슨한결합
                if((answer36.getText().toString().equals("드라이버") || answer36.getText().toString().equals("driver"))
                        && (answer37.getText().toString().equals("클린코드") || answer37.getText().toString().equals("클린 코드"))
                        && (answer38.getText().toString().equals("허브 앤 스포크") || answer38.getText().toString().equals("Hub & Spoke") || answer38.getText().toString().equals("hub & spoke"))
                        && (answer39.getText().toString().equals("메시지버스") || answer39.getText().toString().equals("메시지 버스") || answer39.getText().toString().equals("Message Bus") || answer39.getText().toString().equals("message bus"))
                        && (answer40.getText().toString().equals("느슨한 결합") || answer40.getText().toString().equals("loose coupling"))
                ){
                    getFragmentManager().beginTransaction().replace(R.id.container,page09).commit();
                }
            }
        });


        // 이전 문제
        page07 = new Practical50_07();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page07).commit();
            }
        });

        return  rootview;
    }
}