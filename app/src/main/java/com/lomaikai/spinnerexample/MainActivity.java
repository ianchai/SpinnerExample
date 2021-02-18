package com.lomaikai.spinnerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

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
    }
}