package com.example.homepage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginPage extends AppCompatActivity {
    Button loginButton;
    EditText email,password;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        loginButton = findViewById(R.id.loginButton);
        email = findViewById(R.id.textLoginEmail);
        password = findViewById(R.id.textLoginPassword);
        textView=findViewById(R.id.textView4);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mEmail = email.getText().toString().trim();
                String mPassword = password.getText().toString().trim();

                if(TextUtils.isEmpty(mEmail)){
                    email.setError("Email is required");
                }

                if(TextUtils.isEmpty(mPassword)){
                    password.setError("Password is required");
                }
                else{
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(loginPage.this,"successfully Login",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(loginPage.this,Homepage.class));

                        }
                    },3000);
                }
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginPage.this,signPage.class));
            }
        });


    }
}