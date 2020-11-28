package com.example.homepage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;






public class signInPage extends AppCompatActivity {

    Button register;
    EditText fullName,address,phoneNo,email,password;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_page);

        register = findViewById(R.id.register);
        fullName = findViewById(R.id.textName);

        address = findViewById(R.id.textAddress);
        phoneNo = findViewById(R.id.textNumber);
        email = findViewById(R.id.textLoginEmail);
        password = findViewById(R.id.textLoginPassword);
        textView=findViewById(R.id.textView3);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(signInPage.this,login.class));
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(signInPage.this,login.class));
            }

        });




    }
}