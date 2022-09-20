package com.example.agribusinessadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProjectViabilityActivity extends AppCompatActivity {

    private double income;
    private double seed;
    private double fertiliser;
    private double labour;
    private double other;
    private double costsum;
    private double result;
    private String profit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_viability);
    }

    public void calculateProfit(View view){

        try{

            TextView answerTextView = (TextView) findViewById(R.id.txtGrossMargin);
            EditText e1 = (EditText) findViewById(R.id.etIncome);
            EditText e2 = (EditText) findViewById(R.id.etSeedCost);
            EditText e3 = (EditText) findViewById(R.id.etFertiliserCost);
            EditText e4 = (EditText) findViewById(R.id.etLabourCosts);
            EditText e5 = (EditText) findViewById(R.id.etOtherCosts);

            String val1 = e1.getText().toString();
            String val2 = e2.getText().toString();
            String val3 = e3.getText().toString();
            String val4 = e4.getText().toString();
            String val5 = e5.getText().toString();

            income = Double.parseDouble(val1);
            seed = Double.parseDouble(val2);
            fertiliser = Double.parseDouble(val3);
            labour = Double.parseDouble(val4);
            other = Double.parseDouble(val5);

            costsum = seed+fertiliser+labour+other;

            result = income-costsum;
            profit = String.valueOf(result);

            answerTextView.setText(profit);

        }

        catch (Exception e) {
            Toast toast = Toast.makeText(this, "Error in input values, please verify", Toast.LENGTH_LONG);
            toast.show();
        }


    }
}
