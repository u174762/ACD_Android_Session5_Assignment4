package com.android.vicky.intentlogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welocome extends AppCompatActivity {
    TextView txtWelComeMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welocome);
        txtWelComeMsg = (TextView)findViewById(R.id.welcomeMessage);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            txtWelComeMsg.setText("Welcome "+extras.getString("UserName"));
        }
    }
}
