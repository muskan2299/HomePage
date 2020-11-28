package com.example.homepage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class geolocation extends AppCompatActivity {
    ListView shopList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geolocation);
        shopList=findViewById(R.id.shopListView);
        ArrayList<String> shops= new ArrayList<String>();
        shops.add("Shop1");
        shops.add("Shop2");
        shops.add("Shop3");
        shops.add("Shop4");
        shops.add("Shop5");


        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,shops);
        shopList.setAdapter(arrayAdapter);
        shopList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(geolocation.this,shopDetails.class));
            }
        });
    }
}