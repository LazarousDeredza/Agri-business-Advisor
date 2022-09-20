package com.example.agribusinessadvisor;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AgribusinessAdvisorDatabaseHelper extends SQLiteOpenHelper {



    public static final String DB_NAME = "agribusiness"; //name of database
    public static final int DB_VERSION = 2; //version of the database

    AgribusinessAdvisorDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db){

        updateMyDatabase(db, 0, DB_VERSION);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        updateMyDatabase(db, oldVersion, newVersion);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion){
        if(oldVersion<1){
            db.execSQL("CREATE TABLE CROP("
                    +"_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    +"CROP_NAME TEXT, "
                    +"LAND_PREPARATION TEXT, "
                    +"PLANTING TEXT, "
                    +"CROP_MANAGEMENT TEXT, "
                    +"PEST_MANAGEMENT TEXT, "
                    +"IMAGE_RESOURCE_ID INTEGER);");

            insertCrop(db, "Maize",
                    " Can use Conservation - using basins and furrows, green and dead mulching and herbicides to ensure weed free field. OR Convetional - using Automn Ploughing and ploughing with rains to ensure weed free field",
                    "Can use water planting - 2 to 3 weeks before rain season, with water OR Can use dry planting - 2 to 3 weeks before rain season, without water OR Can use rain planting - with the first effective rains, above 20mm. Planting depth is 5 to 7.5cm.",
                    "Keep weed free for first 6 to 8 weeks and have late weeding before harvesting. Use herbicides - Preplanting herbicides, Glyphoset, to control remnant weeds. Preemergence, Metalaclo, Battlagold, 2 to 3 days after planting. Postemergence, NicoSulfron at 3 leaf stage and Stellar Star, at 6 leaf stage.",
                    "Scout on a daily basis and apply pesticides when pest economic injury level is reached. Scout for Fall Army worm eggs when crop is at 2 leaf stage and Black heads at first insta, spray using recommended pesticides ",
                    R.drawable.maize);

        }

        if(oldVersion<2){
            db.execSQL("ALTER TABLE DRINK ADD COLUMN FAVORITE NUMERIC");

        }
    }


    private static void insertCrop(SQLiteDatabase db, String crop_name, String land_preparation,
                                   String planting, String crop_management, String pest_management,
                                   int resourceId){
        ContentValues cropValues = new ContentValues();
        cropValues.put("CROP_NAME", crop_name);
        cropValues.put("LAND_PREPARATION", land_preparation);
        cropValues.put("PLANTING", planting);
        cropValues.put("CROP_MANAGEMENT", crop_management);
        cropValues.put("PEST_MANAGEMENT", pest_management);
        cropValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("CROP", null, cropValues);

    }

}
