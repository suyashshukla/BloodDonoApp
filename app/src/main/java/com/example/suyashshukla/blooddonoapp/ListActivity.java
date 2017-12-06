package com.example.suyashshukla.blooddonoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    public static String information;
    public static int mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donor_list);


       ArrayList<String> donors = new ArrayList<>();

        donors.add(getString(R.string.d1));
        donors.add(getString(R.string.d2));
        donors.add(getString(R.string.d3));
        donors.add(getString(R.string.d4));
        donors.add(getString(R.string.d5));

        ListView list = (ListView) findViewById(R.id.donor_list);

        ArrayAdapter<String> listAdapter = new ArrayAdapter(this,R.layout.list_item,donors);

        list.setAdapter(listAdapter);





    }

    public void info(View view){
        TextView textView = (TextView) view;
        String name = (String)textView.getText();

        if(name.equals(getString(R.string.d1))) {
            information = getString(R.string.i1);
            mobile = R.integer.m1;
        }
        if(name.equals(getString(R.string.d2))){
            information = getString(R.string.i2);
            mobile = R.integer.m2;
        }
        if(name.equals(getString(R.string.d3))) {
            information = getString(R.string.i3);
            mobile = R.integer.m3;
        }
        if(name.equals(getString(R.string.d4))) {
            information = getString(R.string.i4);
            mobile = R.integer.m4;
        }
        if(name.equals(getString(R.string.d5))) {
            information = getString(R.string.i5);
            mobile = R.integer.m5;
        }

        Intent intent = new Intent(this,InfoActivity.class);
        startActivity(intent);



        }

    }

