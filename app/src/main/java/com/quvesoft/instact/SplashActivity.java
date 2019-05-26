package com.quvesoft.instact;import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {
    String TAG = "yhjoo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(TAG,"Hello World");
    }
}
