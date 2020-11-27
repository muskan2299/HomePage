package com.example.homepage2;

import android.content.Intent;
import android.os.Bundle;

import android.renderscript.ScriptGroup;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class Pending extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pending);



        listView = findViewById(R.id.listview1);
        // call this function to add customer name and pass name as string
        Customers("OrderNo");

    }

    public void Customers(String c) {
        ArrayList<String> TableContent = new ArrayList<String>();

        //Customer name to be added here
        TableContent.add(c);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, TableContent);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //new page opened showing customer details::
                Toast.makeText(Pending.this, TableContent.get(position) , Toast.LENGTH_LONG).show();
                //startActivity(new Intent(Pending.this,Info.class));
                //pass order no.to c

                Intent intent= new Intent(Pending.this, Info.class);
                startActivity(intent);

            }
        });
    }

}