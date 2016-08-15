package com.example.franciscofranco.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class OtherFragment extends Fragment {
    private int count = 0;
    private TextView textView1;

    public OtherFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            count = 0;
        } else {
            count = savedInstanceState.getInt("count");

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_other, container, false);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView1 = (TextView) getActivity().findViewById(R.id.textView);
        textView1.setText(String.valueOf(count));
    }

    public void incrementData() {
        String string = textView1.getText().toString();
        count = Integer.parseInt(string);
        ++count;
        textView1.setText(String.valueOf(count));
    }
}
