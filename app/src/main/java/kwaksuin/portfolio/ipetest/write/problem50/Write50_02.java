package kwaksuin.portfolio.ipetest.write.problem50;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import kwaksuin.portfolio.ipetest.R;

public class Write50_02 extends Fragment {
    Write50_01 page01;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.write50_02,container,false);

        page01 = new Write50_01();

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