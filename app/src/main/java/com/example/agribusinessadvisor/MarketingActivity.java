package com.example.agribusinessadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MarketingActivity extends AppCompatActivity {

    private MarketExpert expert = new MarketExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing);


    }

    public void findAdvice(View view){
        TextView market_description = (TextView) findViewById(R.id.market_description);
        TextView market_advantages = (TextView) findViewById(R.id.market_advantages);
        TextView market_disadvantages = (TextView) findViewById(R.id.market_disadvantages);
        Spinner crop_markets = (Spinner) findViewById(R.id.crop_markets);

        String marketType = String.valueOf(crop_markets.getSelectedItem());

        List<String> descriptionsList = expert.getDescription(marketType);
        List<String> advantagesList = expert.getAdvantages(marketType);
        List<String> disadvantagesList = expert.getDisadvantages(marketType);

        StringBuilder descriptionsFormatted = new StringBuilder();
        StringBuilder advantagesFormatted = new StringBuilder();
        StringBuilder disadvantagesFormatted = new StringBuilder();

        for(String description: descriptionsList){
            descriptionsFormatted.append(description).append('\n');
        }

        for(String advantage: advantagesList){
            advantagesFormatted.append(advantage).append('\n');
        }

        for(String disadvantage: disadvantagesList){
            disadvantagesFormatted.append(disadvantage).append('\n');
        }

        market_description.setText(descriptionsFormatted);
        market_advantages.setText(advantagesFormatted);
        market_disadvantages.setText(disadvantagesFormatted);


    }
}
