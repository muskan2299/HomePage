package com.example.homepage2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Info extends AppCompatActivity {

    ListView listView1;
    Button submit;
    TextView Name, number; //these are the text to be inserted info of customer
    TextView cname,no;

    public void orderList(String c){
        ArrayList<String> TableContent = new ArrayList<String>();
        //list Items to be added
        TableContent.add(c);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, TableContent);
        listView1.setAdapter(arrayAdapter);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        listView1 = (ListView) findViewById(R.id.orderlist); //this list will contain order items
        Name=findViewById(R.id.name);
        number=findViewById(R.id.phone);
        cname = findViewById(R.id.cname);
        no=findViewById(R.id.no);
        submit=findViewById(R.id.button3);




        //list items to be inputted here
        orderList("items");

        //when pressed on submit
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // here u hav to insert code to transfer this order to packed

                Toast.makeText(Info.this, "Successfully submitted!!", Toast.LENGTH_LONG).show();
                startActivity(new Intent(Info.this,Homepage.class));
            }
        });

    }

}
