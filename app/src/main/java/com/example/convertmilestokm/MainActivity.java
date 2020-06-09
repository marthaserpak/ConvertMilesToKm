package com.example.convertmilestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnConvertMilesToKm = findViewById(R.id.convertToKm);
        btnConvertMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxMiles = findViewById(R.id.et_miles);
                EditText textBoxKm = findViewById(R.id.et_km);
                double vMiles = Double.parseDouble(textBoxMiles.getText().toString());
                double vKm = vMiles / 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                textBoxKm.setText(formatVal.format(vKm));
            }
        });

        Button btnConvertKmToMiles = findViewById(R.id.convertToMiles);
        btnConvertKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textBoxKm = findViewById(R.id.et_km);
                EditText textBoxMiles = findViewById(R.id.et_miles);
                double vKm = Double.parseDouble(textBoxKm.getText().toString());
                double vMiles = vKm * 0.62137;
                DecimalFormat formatVal  = new DecimalFormat("##.##");
                textBoxMiles.setText(formatVal.format(vMiles));
            }
        });


    }
}