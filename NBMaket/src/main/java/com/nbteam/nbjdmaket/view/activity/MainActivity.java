package com.nbteam.nbjdmaket.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.nbteam.nbjdmaket.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.print("Robin 1111111111111111111");
        System.out.print("Robin 2222222222222222222");
        System.out.print("zw 我是一个粉刷匠");
        System.out.print("zww 我要搞事情");
        System.out.print("zw 我是一个粉刷匠444444444444");
        System.out.print("zw 我是一个粉刷匠555");

        init();
    }

    private void init() {
        Log.d("Main","LSW");
    }
}
