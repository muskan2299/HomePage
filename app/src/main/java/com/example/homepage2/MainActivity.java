package com.example.homepage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public Button button;
    EditText name;
    EditText phone;
    EditText email;
    EditText address;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.uploadButton);
        name=(EditText) findViewById(R.id.customerName);
        phone=(EditText) findViewById(R.id.phoneNo);
        email=(EditText) findViewById(R.id.email);
        address=(EditText) findViewById(R.id.address);
        Log.i("Customer Name",name.getText().toString());
        Log.i("Phone Number",phone.getText().toString());
        Log.i("Email Address",email.getText().toString());
        Log.i("Address",address.getText().toString());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,customerHomepage.class));


            }
        });
    }
}