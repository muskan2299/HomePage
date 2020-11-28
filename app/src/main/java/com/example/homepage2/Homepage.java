package com.example.homepage2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class Homepage extends AppCompatActivity {
    public Toolbar toolbar;

    Button pend,pack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        setTitle(null);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        pend=findViewById(R.id.button1);
        pack=findViewById(R.id.button2);



        pend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Homepage.this,Pending.class));
            }
        });

        pack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Homepage.this,Packed.class));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.slot) {
            Intent i = new Intent(Homepage.this,timeSlot.class);
            this.startActivity(i);
            return true;

        }
        if(id == R.id.profile){
            //startActivity(new Intent(this,Profile.class));
            Intent i = new Intent(Homepage.this,Profile.class);
            this.startActivity(i);
            return true;

        }
        if(id == R.id.logout){
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(Homepage.this,loginPage.class));
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}