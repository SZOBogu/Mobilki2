package com.example.laptop.mobilki2;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment0 extends Fragment {
    private Button butt0;
    private Button butt1;
    private TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle bundle){
        View view = inflater.inflate(R.layout.fragment0_layout, container, false);
        butt0 = (Button) view.findViewById(R.id.button00);
        butt1 = (Button) view.findViewById(R.id.button11);
        text = (TextView) view.findViewById(R.id.text0);
        text.setText("Fragment 1, dzień dobry");

        butt0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Toast.makeText(getActivity(),"Przeciez juz jesteś w tym fragmencie", Toast.LENGTH_LONG).show();
                ((MainActivity)getActivity()).setViewPager(0);
            }
        });
        butt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Toast.makeText(getActivity(),"Fragment 1 odbiór", Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });
        return view;
    }
}
