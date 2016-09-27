package com.android.vicky.intentlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginTest extends AppCompatActivity {
    EditText txtUserName,txtPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_test);
        btnLogin = (Button)findViewById(R.id.login);
        txtUserName = (EditText)findViewById(R.id.userName);
        txtPassword = (EditText)findViewById(R.id.password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = txtUserName.getText().toString();
                String password = txtPassword.getText().toString();
                if(username.equals("suman") && password.equals("password")){
                    Intent connectToWelComeActivity = new Intent(LoginTest.this, Welocome.class);
                    connectToWelComeActivity.putExtra("UserName",txtUserName.getText().toString());
                    startActivity(connectToWelComeActivity);
                }else{
                    Toast.makeText(LoginTest.this,"Please Enter The Correct User Name And Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
