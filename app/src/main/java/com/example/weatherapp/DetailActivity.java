package com.example.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);

            Intent myIntent = getIntent();
            String name = myIntent.getStringExtra("nameKey") != null
                    ? myIntent.getStringExtra("nameKey") : "Buenos Aires";
            TextView nameTextView = findViewById(R.id.nameTextId);
            nameTextView.setText(name);
            TextView actualTempTextView = findViewById(R.id.actualTemp);
            TextView minTempTextView = findViewById(R.id.minTemp);
            TextView maxTempTextView = findViewById(R.id.maxTemp);
            actualTempTextView.setText("15°C");
            minTempTextView.setText("15°C");
            maxTempTextView.setText("19°C");

        }
}
