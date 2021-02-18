package com.lomaikai.spinnerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner carSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carSpinner = findViewById(R.id.carSpinner);

        ArrayList<String> carArrayList = new ArrayList<>();
        carArrayList.add("Hyundai");
        carArrayList.add("Toyota");
        carArrayList.add("Ford");
        carArrayList.add("Proton");
        carArrayList.add("Perodua");
        carArrayList.add("BMW");

        ArrayAdapter<String> carAdapter = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                carArrayList
        );

        carSpinner.setAdapter(carAdapter);

        carSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, carArrayList.get(i)+" selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}