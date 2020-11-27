package com.example.homepage2;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class Packed extends AppCompatActivity {

    ListView listView;

    public void Customers(String c){
        ArrayList<String> TableContent = new ArrayList<String>();
            //Customer name to be added
            TableContent.add(c);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, TableContent);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //status to be toasted here
                Toast.makeText(Packed.this, TableContent.get(position)+"1", Toast.LENGTH_LONG).show();
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.packed);

        listView = findViewById(R.id.listview2);

        //no. of customers to be inputted here
        Customers("OrderNo");

    }

}

