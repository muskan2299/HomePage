package com.example.homepage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class timeSlot extends AppCompatActivity {
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_slot);
        save = findViewById(R.id.saveButton);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(timeSlot.this,Homepage.class));
                Toast.makeText(timeSlot.this,"Successfully Saved",Toast.LENGTH_SHORT).show();
            }
        });
    }
}