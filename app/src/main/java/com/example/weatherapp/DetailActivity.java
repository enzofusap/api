package com.example.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);

            Intent myIntent = getIntent();
            String name = myIntent.getStringExtra("nameKey") != null
                    ? myIntent.getStringExtra("nameKey") : "Buenos Aires";

            getTempOfCities(name);

        }

        private void getTempOfCities(String name){
            String nameQuery = name.concat(",ar");
            Call<Results> resultCall = RetrofitClient.getInstance().getMyApi().getTempOfCity(Api.APP_ID,Api.LANG,Api.UNITS,nameQuery);
            resultCall.enqueue(new Callback<Results>() {
                @Override
                public void onResponse(Call<Results> call, Response<Results> response) {
                    String celsius= " °C";
                    Results result = response.body();
                    result.getCity().setTemp(result.getCity().getTemp() + celsius);
                    result.getCity().setTempMin(result.getCity().getTempMin() + celsius);
                    result.getCity().setTempMax(result.getCity().getTempMax() + celsius);
                    TextView nameTextView = findViewById(R.id.nameTextId);
                    nameTextView.setText(name);
                    TextView actualTempTextView = findViewById(R.id.actualTemp);
                    TextView minTempTextView = findViewById(R.id.minTemp);
                    TextView maxTempTextView = findViewById(R.id.maxTemp);
                    actualTempTextView.setText(result.getCity().getTemp());
                    minTempTextView.setText(result.getCity().getTempMin());
                    maxTempTextView.setText(result.getCity().getTempMax());

                }

                @Override
                public void onFailure(Call<Results> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),"An error has occured",Toast.LENGTH_LONG).show();
                }
            });

        }

}
