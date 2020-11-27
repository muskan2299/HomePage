package com.example.homepage2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    Button save;
    EditText fullName, shopName, address, phoneNo, email;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        save = findViewById(R.id.save);
        fullName = findViewById(R.id.textName);
        shopName = findViewById(R.id.textShopName);
        address = findViewById(R.id.textAddress);
        phoneNo = findViewById(R.id.textNumber);
        email = findViewById(R.id.textLoginEmail);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mEmail = email.getText().toString().trim();
                if (TextUtils.isEmpty(mEmail)) {
                    email.setError("Email is required");
                }
                else {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(Profile.this, "Successfully Saved", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Profile.this, Homepage.class));
                        }
                    }, 3000);
                }
            }
        });
    }
}
