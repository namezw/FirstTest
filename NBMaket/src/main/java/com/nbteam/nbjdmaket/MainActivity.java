package com.nbteam.nbjdmaket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.print("Robin 1111111111111111111");
        System.out.print("Robin 2222222222222222222");

        init();
    }

    private void init() {
        Log.d("MainActivity","Commit by Lsw!!!");
    }
}
