package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_list);
       setupListView();
    }

    public void setupListView(){
        listView = findViewById(R.id.listView);
        names = new ArrayList<>();
        names.add("Buenos Aires");
        names.add("Mendoza");
        names.add("Parana");
        names.add("Rosario");
        names.add("Río grande");
        names.add("Bariloche");
        names.add("Rawson");
        names.add("Santiago");
       CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,names);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                goToDetail(names.get(i));
            }
        });
    }

    private void goToDetail(String name){
        Intent myIntent = new Intent(this,DetailActivity.class);
        myIntent.putExtra("nameKey",name);
        startActivity(myIntent);
    }

}