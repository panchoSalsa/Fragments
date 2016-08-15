package com.example.franciscofranco.fragments;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements Communicate{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        if (findViewById(R.id.fragment_container) != null) {
//            if (savedInstanceState != null) {
//                return;
//            }
//
//            MyFragment myFragment = new MyFragment();
//
//            getFragmentManager().beginTransaction()
//                    .add(R.id.fragment_container, myFragment).commit();
//        }
    }

    @Override
    public void sendData() {
        FragmentManager fm = getFragmentManager();
        OtherFragment otherFragment = (OtherFragment) fm.findFragmentById(R.id.otherFragment);
        otherFragment.incrementData();
    }
}
