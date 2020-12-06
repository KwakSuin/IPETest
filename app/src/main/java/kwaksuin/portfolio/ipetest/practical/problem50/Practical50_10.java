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


public class Practical50_10 extends Fragment {
    Practical50_09 page09;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.practical50_10,container,false);

        EditText answer46 = rootview.findViewById(R.id.answer46);
        EditText answer47 = rootview.findViewById(R.id.answer47);
        EditText answer48 = rootview.findViewById(R.id.answer48);
        EditText answer49 = rootview.findViewById(R.id.answer49);
        EditText answer50 = rootview.findViewById(R.id.answer50);

        // 종료
        Button end = rootview.findViewById(R.id.end);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TCP, WAS, 기밀성/가용성/무결성, 검증/확인, 미들웨어
                if(answer46.getText().toString().equals("TCP")
                        && answer47.getText().toString().equals("WAS")
                        && (answer48.getText().toString().equals("기밀성, 가용성, 무결성") || answer48.getText().toString().equals("기밀성 가용성 무결성") || answer48.getText().toString().equals("기밀성/가용성/무결성"))
                        && (answer49.getText().toString().equals("검증, 확인") || answer49.getText().toString().equals("검증 확인") || answer49.getText().toString().equals("검증/확인"))
                        && answer50.getText().toString().equals("미들웨어")
                ){
                    Toast.makeText(getContext(),"정답입니다. 수고하셨습니다.",Toast.LENGTH_LONG).show();
                }
            }
        });

        // 이전 문제
        page09 = new Practical50_09();
        Button back = rootview.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,page09).commit();
            }
        });

        return  rootview;
    }
}