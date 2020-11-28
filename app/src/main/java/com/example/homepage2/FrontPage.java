package com.example.homepage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrontPage extends AppCompatActivity {
    Button shopkeeper,customer;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
        shopkeeper = findViewById(R.id.register);
        customer = findViewById(R.id.customer);
        image  = findViewById(R.id.splashScreenImage);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                image.setVisibility(View.INVISIBLE);
                shopkeeper.setVisibility(View.VISIBLE);
                customer.setVisibility(View.VISIBLE);
            }
        },2000);

        shopkeeper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FrontPage.this,signPage.class));
            }
        });
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FrontPage.this,signinLoginPage.class));
            }
        });

    }
}
