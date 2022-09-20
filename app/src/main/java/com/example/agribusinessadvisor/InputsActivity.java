package com.example.agribusinessadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static com.example.agribusinessadvisor.Crop.crops;

public class InputsActivity extends AppCompatActivity {

    private double landsize;
    private double compoundDFert;
    private double ammoniumNitrateFert;
    private double seedQuantity;
    private String resCompoundD;
    private String resAmmoniumNitrate;
    private String resSeedQuantity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputs);
    }



    public void calculateInputs(View view){

        try{

            Spinner crops = (Spinner) findViewById(R.id.crops);
            String cropType = String.valueOf(crops.getSelectedItem());

            if(cropType.equals("Maize")){
                TextView ansCompoundD = (TextView) findViewById(R.id.compoundD);
                TextView ansAmmoniumNitrate = (TextView) findViewById(R.id.ammoniumNitrate);
                TextView ansSeeds = (TextView) findViewById(R.id.seeds);

                EditText e1 = (EditText) findViewById(R.id.etLandSize);

                String val1 = e1.getText().toString();

                landsize = Double.parseDouble(val1);

                compoundDFert = 600*landsize;
                ammoniumNitrateFert = 350*landsize;
                seedQuantity = 25*landsize;

                resCompoundD = String.valueOf(compoundDFert);
                resAmmoniumNitrate = String.valueOf(ammoniumNitrateFert);
                resSeedQuantity = String.valueOf(seedQuantity);

                ansCompoundD.setText(resCompoundD);
                ansAmmoniumNitrate.setText(resAmmoniumNitrate);
                ansSeeds.setText(resSeedQuantity);

            }

            else if(cropType.equals("Rapoko")){
                TextView ansCompoundD = (TextView) findViewById(R.id.compoundD);
                TextView ansAmmoniumNitrate = (TextView) findViewById(R.id.ammoniumNitrate);
                TextView ansSeeds = (TextView) findViewById(R.id.seeds);

                EditText e1 = (EditText) findViewById(R.id.etLandSize);

                String val1 = e1.getText().toString();

                landsize = Double.parseDouble(val1);

                compoundDFert = 200*landsize;
                ammoniumNitrateFert = 150*landsize;
                seedQuantity = 5*landsize;

                resCompoundD = String.valueOf(compoundDFert);
                resAmmoniumNitrate = String.valueOf(ammoniumNitrateFert);
                resSeedQuantity = String.valueOf(seedQuantity);

                ansCompoundD.setText(resCompoundD);
                ansAmmoniumNitrate.setText(resAmmoniumNitrate);
                ansSeeds.setText(resSeedQuantity);

            }


            else if(cropType.equals("Pearl Millet")){
                TextView ansCompoundD = (TextView) findViewById(R.id.compoundD);
                TextView ansAmmoniumNitrate = (TextView) findViewById(R.id.ammoniumNitrate);
                TextView ansSeeds = (TextView) findViewById(R.id.seeds);

                EditText e1 = (EditText) findViewById(R.id.etLandSize);

                String val1 = e1.getText().toString();

                landsize = Double.parseDouble(val1);

                compoundDFert = 200*landsize;
                ammoniumNitrateFert = 150*landsize;
                seedQuantity = 10*landsize;

                resCompoundD = String.valueOf(compoundDFert);
                resAmmoniumNitrate = String.valueOf(ammoniumNitrateFert);
                resSeedQuantity = String.valueOf(seedQuantity);

                ansCompoundD.setText(resCompoundD);
                ansAmmoniumNitrate.setText(resAmmoniumNitrate);
                ansSeeds.setText(resSeedQuantity);

            }

            else if(cropType.equals("Sorghum")){
                TextView ansCompoundD = (TextView) findViewById(R.id.compoundD);
                TextView ansAmmoniumNitrate = (TextView) findViewById(R.id.ammoniumNitrate);
                TextView ansSeeds = (TextView) findViewById(R.id.seeds);

                EditText e1 = (EditText) findViewById(R.id.etLandSize);

                String val1 = e1.getText().toString();

                landsize = Double.parseDouble(val1);

                compoundDFert = 200*landsize;
                ammoniumNitrateFert = 150*landsize;
                seedQuantity = 12*landsize;

                resCompoundD = String.valueOf(compoundDFert);
                resAmmoniumNitrate = String.valueOf(ammoniumNitrateFert);
                resSeedQuantity = String.valueOf(seedQuantity);

                ansCompoundD.setText(resCompoundD);
                ansAmmoniumNitrate.setText(resAmmoniumNitrate);
                ansSeeds.setText(resSeedQuantity);

            }else if(cropType.equals("Tobacco")){
                TextView ansCompoundD = (TextView) findViewById(R.id.compoundD);
                TextView ansAmmoniumNitrate = (TextView) findViewById(R.id.ammoniumNitrate);
                TextView ansSeeds = (TextView) findViewById(R.id.seeds);

                EditText e1 = (EditText) findViewById(R.id.etLandSize);

                String val1 = e1.getText().toString();

                landsize = Double.parseDouble(val1);

                compoundDFert = 200*landsize;
                ammoniumNitrateFert = 150*landsize;
                seedQuantity = 12*landsize;

                resCompoundD = String.valueOf(compoundDFert);
                resAmmoniumNitrate = String.valueOf(ammoniumNitrateFert);
                resSeedQuantity = String.valueOf(seedQuantity);

                ansCompoundD.setText(resCompoundD);
                ansAmmoniumNitrate.setText(resAmmoniumNitrate);
                ansSeeds.setText(resSeedQuantity);

            }

        }

        catch (Exception e){

            Toast toast = Toast.makeText(this, "Error in input values, please verify", Toast.LENGTH_LONG);
            toast.show();



        }




    }
}
