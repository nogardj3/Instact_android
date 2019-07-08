package com.quvesoft.instact;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ContactAddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactadd);

        Toolbar tb = findViewById(R.id.contactadd_toolbar) ;
        setSupportActionBar(tb) ;
        setTitle(R.string.contactadd_toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tb.setBackgroundColor(getResources().getColor(R.color.toolbarBackground));
        tb.setTitleTextColor(getResources().getColor(R.color.toolbarText));
    }
}
