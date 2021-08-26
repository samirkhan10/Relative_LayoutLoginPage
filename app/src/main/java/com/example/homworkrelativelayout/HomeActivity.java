package com.example.homworkrelativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class HomeActivity extends AppCompatActivity {
    Spinner spinner,spinner2;
    String[] cities={"Agra","Delhi","Mumbai","Kolkata","Chennai","Gujrat"};
    String[] option={"Pizza","Burger","Sandwich","Chiken Fry","Paneer Tikka"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        spinner=findViewById(R.id.spinner);
        spinner2=findViewById(R.id.spinner2);

        ArrayAdapter adp = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,cities);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adp);

        ArrayAdapter adp1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,option);
        adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adp1);
    }
}