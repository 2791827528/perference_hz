package com.example.administrator.perference_hz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate方法保存Activity的状态
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        // activity_mainw为自带的hello word不需要调用
        getFragmentManager().beginTransaction().add(android.R.id.content, new PrFragment()).commit();
        //Fragment对象
    }
}
