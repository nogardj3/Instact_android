package com.quvesoft.instact;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import com.davidmiguel.numberkeyboard.NumberKeyboard;
import com.davidmiguel.numberkeyboard.NumberKeyboardListener;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;


public class MainActivity extends AppCompatActivity {
    String TAG = "yhjoo";
    NumberKeyboard numberKeyboard;
    MeowBottomNavigation bottomNavigation;
    AppCompatEditText textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);

        textView = findViewById(R.id.numbertext);
        textView.addTextChangedListener(new PhoneNumberFormattingTextWatcher());


        numberKeyboard = findViewById(R.id.numberkeyboard);
        numberKeyboard.setListener(new NumberKeyboardListener() {
            @Override
            public void onNumberClicked(int number) {
                textView.setText(textView.getText().toString() + number);

            }

            @Override
            public void onLeftAuxButtonClicked() {
                Log.w(TAG, "left clicked");
            }

            @Override
            public void onRightAuxButtonClicked() {
                String text = textView.getText().toString();
                if(text.length()!=0)
                    textView.setText(text.substring(0, text.length()-1));
            }
        });

        bottomNavigation = findViewById(R.id.bottomnavigationmenu);
        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_audiotrack_black_24dp));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_brightness_2_black_24dp));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_build_black_24dp));
        bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.ic_directions_run_black_24dp));
        bottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.ic_fingerprint_black_24dp));

        bottomNavigation.setOnShowListener((model -> {
            switch (model.getId()) {
                case 1:
                    startActivity(new Intent(MainActivity.this ,ContactsActivity.class));
                    break;
                case 2:
                    startActivity(new Intent(MainActivity.this ,ContactAddActivity.class));
                    break;
                case 3:
                    startActivity(new Intent(MainActivity.this ,ContactReviseActivity.class));
                    break;
                case 4:
                    startActivity(new Intent(MainActivity.this ,ContactDetailActivity.class));
                    break;
                case 5:
                    startActivity(new Intent(MainActivity.this ,SettingsActivity.class));
                    break;
            }
            return null;}));
    }
}
