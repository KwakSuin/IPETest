package kwaksuin.portfolio.ipetest.practical.problem50;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import kwaksuin.portfolio.ipetest.R;

// 실기 21 ~ 25번 문제
public class Practical50_05 extends Fragment {
    Practical50_04 page04;
    Practical50_06 page06;
    Animation animation;

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
                
                // 21번 오답
                if(answer21.getText().toString().equals("워크스루") || answer21.getText().toString().equals("워크 스루") == false){
                    TextView error21 = rootView.findViewById(R.id.error21);
                    error21.setVisibility(View.VISIBLE);
                }

                // 21번 오답
                if(answer22.getText().toString().equals("인스펙션") == false){
                    TextView error22 = rootView.findViewById(R.id.error22);
                    error22.setVisibility(View.VISIBLE);
                }

                // 23번 오답
                if(answer23.getText().toString().equals("EAI") == false){
                    TextView error23 = rootView.findViewById(R.id.error23);
                    error23.setVisibility(View.VISIBLE);
                }

                // 24번 오답
                if(answer24.getText().toString().equals("ESB") == false){
                    TextView error24 = rootView.findViewById(R.id.error24);
                    error24.setVisibility(View.VISIBLE);
                }

                // 25번 오답
                if(answer25.getText().toString().equals("트랜잭션") || answer25.getText().toString().equals("Transaction") == false){
                    TextView error25 = rootView.findViewById(R.id.error25);
                    error25.setVisibility(View.VISIBLE);
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

        // hint 효과
        // AlphaAnimation = 투명도 조절
        // setDuration = 투명도 시간, 100 = 1초
        animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(1000);
        animation.setStartOffset(20);

        // 21번 문제 정답
        Button hint21_bt = rootView.findViewById(R.id.hint21_bt);
        TextView hint21 = rootView.findViewById(R.id.hint21);
        hint21_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint21.setVisibility(View.VISIBLE);
                hint21.startAnimation(animation);
                hint21.setVisibility(View.INVISIBLE);
            }
        });

        // 22번 문제 정답
        Button hint22_bt = rootView.findViewById(R.id.hint22_bt);
        TextView hint22 = rootView.findViewById(R.id.hint22);
        hint22_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint22.setVisibility(View.VISIBLE);
                hint22.startAnimation(animation);
                hint22.setVisibility(View.INVISIBLE);
            }
        });

        // 23번 문제 정답
        Button hint23_bt = rootView.findViewById(R.id.hint23_bt);
        TextView hint23 = rootView.findViewById(R.id.hint23);
        hint23_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint23.setVisibility(View.VISIBLE);
                hint23.startAnimation(animation);
                hint23.setVisibility(View.INVISIBLE);
            }
        });

        // 24번 문제 정답
        Button hint24_bt = rootView.findViewById(R.id.hint24_bt);
        TextView hint24 = rootView.findViewById(R.id.hint24);
        hint24_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint24.setVisibility(View.VISIBLE);
                hint24.startAnimation(animation);
                hint24.setVisibility(View.INVISIBLE);
            }
        });

        // 25번 문제 정답
        Button hint25_bt = rootView.findViewById(R.id.hint25_bt);
        TextView hint25 = rootView.findViewById(R.id.hint25);
        hint25_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hint25.setVisibility(View.VISIBLE);
                hint25.startAnimation(animation);
                hint25.setVisibility(View.INVISIBLE);
            }
        });

        return rootView;
    }
}