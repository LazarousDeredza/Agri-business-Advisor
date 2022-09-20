package com.example.agribusinessadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CropActivity extends AppCompatActivity {

    public static final String EXTRA_CROPNO = "cropNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop);

        Button btnMarketing = (Button) findViewById(R.id.btnMarketing);
        btnMarketing.setOnClickListener(new
                                                View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View view) {
                                                        Intent intent = new Intent(CropActivity.this, MarketingActivity.class);
                                                        startActivity(intent);
                                                    }
                                                });


        //Get the crop from the intent
        int cropNo = (int) getIntent().getExtras().get(EXTRA_CROPNO);

      Crop crop = Crop.crops[cropNo];  //Using Crop class


        /*
        //Create a cursor to use database
        try{
            SQLiteOpenHelper agribusinessAdvisorDatabaseHelper =
                    new AgribusinessAdvisorDatabaseHelper(this);
            SQLiteDatabase db = agribusinessAdvisorDatabaseHelper.getReadableDatabase();
            Cursor cursor = db.query(
                    "CROP", new String[] {"CROP_NAME", "LAND_PREPARATION", "PLANTING", "CROP_MANAGEMENT",
                    "PEST_MANAGEMENT", "IMAGE_RESOURCE_ID"},
                    "_id = ? ",
                    new String[] {Integer.toString(cropNo)},
                    null, null, null
            );

            //Move to the first record in the Cursor
            if(cursor.moveToFirst()){

                //get the crop details from the cursor
                String cropnameText = cursor.getString(0);
                String landpreparationText = cursor.getString(1);
                String plantingText = cursor.getString(2);
                String cropmanagementText = cursor.getString(3);
                String pestmanagementText = cursor.getString(4);
                int photoId = cursor.getInt(5);

                //Populate the crop image
                ImageView photo = (ImageView) findViewById(R.id.photo);
                photo.setImageResource(photoId);
                photo.setContentDescription(cropnameText);

                //Populate the crop name

                TextView crop_name = (TextView)findViewById(R.id.crop_name);
                crop_name.setText(cropnameText);

                //Populate land preparation
                TextView land_preparation = (TextView) findViewById(R.id.land_preparation);
                land_preparation.setText(landpreparationText);

                //Populate planting
                TextView planting = (TextView) findViewById(R.id.planting);
                planting.setText(plantingText);

                //Populate crop management
                TextView crop_management = (TextView) findViewById(R.id.crop_management);
                crop_management.setText(cropmanagementText);

                //Populate pest management
                TextView pest_management = (TextView) findViewById(R.id.pest_management);
                pest_management.setText(pestmanagementText);

            }

            cursor.close();
            db.close();
        }
        catch(SQLiteException e){
            Toast toast = Toast.makeText(this, "Database Unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }  */



// Using Crop class
        //Populate the crop image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(crop.getImageResourceId());
        photo.setContentDescription(crop.getCrop_name());

        //Populate the crop name

        TextView crop_name = (TextView)findViewById(R.id.crop_name);
        crop_name.setText(crop.getCrop_name());

        //Populate land preparation
        TextView land_preparation = (TextView) findViewById(R.id.land_preparation);
        land_preparation.setText(crop.getLand_preparation());

        //Populate planting
        TextView planting = (TextView) findViewById(R.id.planting);
        planting.setText(crop.getPlanting());

        //Populate crop management
        TextView crop_management = (TextView) findViewById(R.id.crop_management);
        crop_management.setText(crop.getCrop_management());

        //Populate pest management
        TextView pest_management = (TextView) findViewById(R.id.pest_management);
        pest_management.setText(crop.getPest_management());



    }

    public void Input(View v){
        Intent intent = new Intent(CropActivity.this, InputsActivity.class);
        startActivity(intent);
    }

}
