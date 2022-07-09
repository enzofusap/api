package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToListActivity(View view ){
        Intent myIntent = new Intent(this, ListActivity.class);
        startActivity(myIntent);
    }

    public void goToDetailActivity(View view ){
        Intent myIntent = new Intent(this, DetailActivity.class);
        startActivity(myIntent);
    }
}