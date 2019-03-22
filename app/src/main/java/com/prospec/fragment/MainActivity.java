package com.prospec.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }//Medthod

    public void replaceToContainer1(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container1, MyFragment.newInstance("Hello Click Button 1 :" + Math.random()))
                .commit();

    }

    public void replaceToContainer2(View view) {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container2, MyFragment.newInstance("Hello Click Button 2 :" + Math.random()))
                .commit();
    }
}//Main Class
