package com.example.jae.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String storage = "";
    public String storageTWO = "";
    public boolean functionIsPicked = false;
    public boolean multiplyIsPicked = false;
    public boolean divideIsPicked = false;
    public boolean additionIsPicked = false;
    public boolean subtractionIsPicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ACpressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storage = "";
        storageTWO = "";
        functionIsPicked = false;
        multiplyIsPicked = false;
        divideIsPicked = false;
        additionIsPicked = false;
        subtractionIsPicked = false;
        result.setText(storage);
    }

    public void Signpressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        if(!storage.equals("")){
            double switched = Double.parseDouble(storage);
            switched *= -1;
            storage = String.valueOf(switched);
        }
        result.setText(storage);
    }

    public void Modpressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        if(storage != ""){
            double percentageValue = Double.parseDouble(storage);
            percentageValue = percentageValue / 100;
            storage = String.valueOf(percentageValue);
            result.setText(storage);
        }
        result.setText(storage);

    }

    public void Dividepressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storageTWO = storage;
        storage = "";

        functionIsPicked = true;
        divideIsPicked = true;

        multiplyIsPicked = false;
        additionIsPicked = false;
        subtractionIsPicked = false;

        result.setText(storage);

    }

    public void Sevenpressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storage += "7";
        result.setText(storage);
    }

    public void Eightpressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storage += "8";
        result.setText(storage);
    }

    public void Ninepressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storage += "9";
        result.setText(storage);
    }

    public void Multiplicationpressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storageTWO = storage;
        storage = "";

        functionIsPicked = true;
        divideIsPicked = false;

        multiplyIsPicked = true;
        additionIsPicked = false;
        subtractionIsPicked = false;

        result.setText(storage);
    }

    public void Fourpressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storage += "4";
        result.setText(storage);
    }

    public void Fivepressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storage += "5";
        result.setText(storage);
    }

    public void Sixpressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storage += "6";
        result.setText(storage);
    }

    public void Subtractionpressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storageTWO = storage;
        storage = "";

        functionIsPicked = true;
        divideIsPicked = false;

        multiplyIsPicked = false;
        additionIsPicked = false;
        subtractionIsPicked = true;

        result.setText(storage);
    }

    public void Onepressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storage += "1";
        result.setText(storage);
    }

    public void Twopressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storage += "2";
        result.setText(storage);
    }

    public void Threepressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storage += "3";
        result.setText(storage);
    }

    public void Additionpressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storageTWO = storage;
        storage = "";

        functionIsPicked = true;
        divideIsPicked = false;

        multiplyIsPicked = false;
        additionIsPicked = true;
        subtractionIsPicked = false;

        result.setText(storage);
    }

    public void Zeropressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storage += "0";
        result.setText(storage);
    }

    public void Decimalpressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        storage += ".";
        result.setText(storage);
    }

    public void Equalspressed(View view) {
        TextView result = (TextView) findViewById(R.id.result_Text);
        double finalStorage = 0;
        double finalStorageTWO = 0;

        if(storage != "" && storageTWO != ""){
            String finalValue;
            finalStorage = Double.parseDouble(storage);
            finalStorageTWO = Double.parseDouble(storageTWO);
            if(additionIsPicked == true){
                double answer = (finalStorage + finalStorageTWO);
                finalValue = String.valueOf(answer);
            }
            else if(multiplyIsPicked == true){
                double answer = (finalStorage * finalStorageTWO );
                finalValue = String.valueOf(answer);
            }
            else if(subtractionIsPicked == true){
                double answer = (finalStorage - finalStorageTWO );
                finalValue = String.valueOf(answer);
            }
            else if(divideIsPicked == true){
                double answer = (finalStorage / finalStorageTWO );
                finalValue = String.valueOf(answer);
            }
            else{
                finalValue = storage;
            }
            storage = finalValue;

            result.setText(storage);
        }
    }
}
