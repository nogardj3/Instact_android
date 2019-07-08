package com.quvesoft.instact;

import android.os.Bundle;import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class ContactReviseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactrevise);

        Toolbar tb = findViewById(R.id.contactrevise_toolbar) ;
        setSupportActionBar(tb) ;
        setTitle(R.string.contactrevise_toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tb.setBackgroundColor(getResources().getColor(R.color.toolbarBackground));
        tb.setTitleTextColor(getResources().getColor(R.color.toolbarText));
    }
}
