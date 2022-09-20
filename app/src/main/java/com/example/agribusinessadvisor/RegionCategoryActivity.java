package com.example.agribusinessadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegionCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region_category);

        Button btnRegion1 = (Button)findViewById(R.id.btnRegion1);
        btnRegion1.setOnClickListener(new
                                              View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View view) {
                                                      Intent intent = new
                                                              Intent(RegionCategoryActivity.this, CropCategoryActivity.class);
                                                      startActivity(intent);
                                                  }
                                              });

        Button btnRegion2 = (Button) findViewById(R.id.btnRegion2);
        btnRegion2.setOnClickListener(new
                                              View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View view) {
                                                      Intent intent = new
                                                              Intent(RegionCategoryActivity.this, CropCategoryActivity.class);
                                                      startActivity(intent);
                                                  }
                                              });

        Button btnRegion3 = (Button) findViewById(R.id.btnRegion3);
        btnRegion3.setOnClickListener(new
                                              View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View view) {
                                                      Intent intent = new
                                                              Intent(RegionCategoryActivity.this, CropCategoryActivity.class);
                                                      startActivity(intent);
                                                  }
                                              });

        Button btnRegion4 = (Button) findViewById(R.id.btnRegion4);
        btnRegion4.setOnClickListener(new
                                              View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View view) {
                                                      Intent intent = new
                                                              Intent(RegionCategoryActivity.this, CropCategoryActivity.class);
                                                      startActivity(intent);
                                                  }
                                              });

        Button btnRegion5 = (Button) findViewById(R.id.btnRegion5);
        btnRegion5.setOnClickListener(new
                                              View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View view) {
                                                      Intent intent = new
                                                              Intent(RegionCategoryActivity.this, CropCategoryActivity.class);
                                                      startActivity(intent);
                                                  }
                                              });



    }

}
