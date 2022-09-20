package com.example.agribusinessadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class CropCategoryActivity extends ListActivity {
    private SQLiteDatabase db;
    private Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_crop_category);

        ListView listCrops = getListView();


         //Using Crop class
        ArrayAdapter<Crop> listAdapter = new ArrayAdapter<Crop>(this,
                android.R.layout.simple_list_item_1, Crop.crops);
        listCrops.setAdapter(listAdapter);


        //Using database
        /*

        try{
            SQLiteOpenHelper agribusinessAdvisorDatabaseHelper =
                    new AgribusinessAdvisorDatabaseHelper(this);
            db = agribusinessAdvisorDatabaseHelper.getReadableDatabase();

            cursor = db.query("CROP",
                    new String[]{"_id", "CROP_NAME"},
                    null, null, null, null, null);

            CursorAdapter listAdapter = new SimpleCursorAdapter(this,
                    android.R.layout.simple_list_item_1,
                    cursor,
                    new String[]{"CROP_NAME"},
                    new int[]{android.R.id.text1},
                    0);
            listCrops.setAdapter(listAdapter);
        }
        catch (SQLiteException e){
            Toast toast = Toast.makeText(this, "Database Unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }  */
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
//        cursor.close();
      //  db.close();
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(CropCategoryActivity.this, CropActivity.class);
        intent.putExtra(CropActivity.EXTRA_CROPNO, (int) id);
        startActivity(intent);
    }
}
