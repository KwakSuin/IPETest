package kwaksuin.portfolio.ipetest.write;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import kwaksuin.portfolio.ipetest.R;

public class Write50_01 extends Fragment {
    Write50_02 page02;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.write50_01,container,false);

        page02 = new Write50_02();

        Button next = rootView.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container, page02).commit();
            }
        });
        return rootView;

    }
}