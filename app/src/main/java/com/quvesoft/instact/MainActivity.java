package com.quvesoft.instact;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.davidmiguel.numberkeyboard.NumberKeyboard;
import com.davidmiguel.numberkeyboard.NumberKeyboardListener;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;


public class MainActivity extends AppCompatActivity {
    String TAG = "yhjoo";
    NumberKeyboard numberKeyboard;
    MeowBottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberKeyboard = findViewById(R.id.numberkeyboard);


        numberKeyboard.setListener(new NumberKeyboardListener() {
            @Override
            public void onNumberClicked(int number) {
                Log.w(TAG,number+"");
            }

            @Override
            public void onLeftAuxButtonClicked() {
                Log.w(TAG,"left clicked");
            }

            @Override
            public void onRightAuxButtonClicked() {
                Log.w(TAG,"right clicked");
            }
        });

        bottomNavigation = findViewById (R.id.bottomnavigationmenu);
        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_audiotrack_black_24dp));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_brightness_2_black_24dp));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_build_black_24dp));
//        bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.ic_directions_run_black_24dp));
//        bottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.ic_fingerprint_black_24dp));
    }
}
