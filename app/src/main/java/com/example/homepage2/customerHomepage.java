package com.example.homepage2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class customerHomepage extends AppCompatActivity {
    Button editDetails;
    ImageButton create;
    ListView orderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_homepage);
        editDetails=findViewById(R.id.editDetails);
        create=findViewById(R.id.addButton);
        orderList=findViewById(R.id.orderList);
        ArrayList<String> orders= new ArrayList<String>();
        orders.add("Order1");
        orders.add("Order2");
        orders.add("Order3");
        orders.add("Order4");
        orders.add("Order5");
        orders.add("Order6");
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,orders);
        orderList.setAdapter(arrayAdapter);
        orderList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                startActivity(new Intent(customerHomepage.this,Order_Details.class));
            }
        });


        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(customerHomepage.this,geolocation.class)));
            }
        });
        editDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(customerHomepage.this,MainActivity.class));
            }
        });

    }
}