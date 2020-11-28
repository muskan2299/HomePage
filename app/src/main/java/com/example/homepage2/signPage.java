package com.example.homepage2;

import androidx.annotation.NonNull;
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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class signPage extends AppCompatActivity {
    Button register;
    EditText fullName,shopName,address,phoneNo;
    EditText email,password;
    private FirebaseAuth mAuth;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_page);
        register = findViewById(R.id.register);
        fullName = findViewById(R.id.textName);
        shopName = findViewById(R.id.textShopName);
        address = findViewById(R.id.textAddress);
        phoneNo = findViewById(R.id.textNumber);
        email = findViewById(R.id.textLoginEmail);
        password = findViewById(R.id.textLoginPassword);
        textView=findViewById(R.id.textView3);

        mAuth = FirebaseAuth.getInstance();

        if(mAuth.getCurrentUser() != null){
            startActivity(new Intent(signPage.this,loginPage.class));
            finish();
        }

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mEmail = email.getText().toString().trim();
                String mPassword = password.getText().toString().trim();

                if(TextUtils.isEmpty(mEmail)){
                    email.setError("Email is required");
                    return;
                }

                if(TextUtils.isEmpty(mPassword)){
                    password.setError("Password is required");
                    return;
                }
                if(password.length() < 6){
                    password.setError("Password must be more than or equal to 6 character");
                    return;
                }

                mAuth.createUserWithEmailAndPassword(mEmail,mPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){

                                    Toast.makeText(signPage.this,"Successfully Signin",Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(signPage.this,loginPage.class));
                    }
                        else{
                            Toast.makeText(signPage.this,"Error!"+ task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }
                }
        });

    }
});
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(signPage.this,loginPage.class));
            }
        });
    }
}