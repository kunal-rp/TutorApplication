package com.example.kpadmin.tutorapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import java.util.ArrayList;

/**
 * Created by KP Admin on 10/22/2016.
 */

public class DBHandler extends SQLiteOpenHelper {

    private static int VERSION_NUMBER = 1;
    private static String TABLE_NAME = "tuber_db_table";
    private static String COLUMN_TUTOR_NAME = "tutor_name";
    private static String COLUMN_TUTOR_RATING = "tutor_rating";
    private static String COLUMN_TUTOR_ID = "tutor_id";


    private static final String TUTOR_TABLE_CREATE =
            "CREATE TABLE " + TABLE_NAME + "(" +
                    COLUMN_TUTOR_ID + " INTEGER PRIMARY KEY, " +
                    COLUMN_TUTOR_NAME + " TEXT," +
                    COLUMN_TUTOR_RATING + " INTEGER"+
                    " );";

    public DBHandler(Context context) {
        super(context, TABLE_NAME, null, VERSION_NUMBER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TUTOR_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void addTutor(Tutor_Object tutor) {

        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COLUMN_TUTOR_ID, getTutorCount()+1 );
        values.put(COLUMN_TUTOR_NAME, tutor.getFull_Name());
        values.put(COLUMN_TUTOR_RATING, tutor.getRating());
        db.insert(TABLE_NAME, null, values);
        db.close();

    }

    public Tutor_Object getTutor(int id) {


        Tutor_Object tutor = new Tutor_Object();
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT * FROM " + TABLE_NAME + " WHERE " + COLUMN_TUTOR_ID + " = " + id;
        Cursor c = db.rawQuery(selectQuery, null);

        c.moveToFirst();

        while (!c.isAfterLast()) {
            if (c.getString(c.getColumnIndex(COLUMN_TUTOR_NAME)) != null) {

                tutor.setFull_Name(c.getString(c.getColumnIndex(COLUMN_TUTOR_NAME)));
                tutor.setRating(c.getInt(c.getColumnIndex(COLUMN_TUTOR_RATING)));
                tutor.setTutor_id(c.getInt(c.getColumnIndex(COLUMN_TUTOR_ID)));
                c.moveToNext();


            }
        }

        return tutor;
    }

    public ArrayList<Tutor_Object> getallTutors(){

        ArrayList<Tutor_Object> tutors = new ArrayList<Tutor_Object>();
        SQLiteDatabase db = this.getReadableDatabase();
        String selectQuery = "SELECT * FROM " + TABLE_NAME ;
        Cursor c = db.rawQuery(selectQuery, null);

        c.moveToFirst();

        while (!c.isAfterLast()) {
            if (c.getString(c.getColumnIndex(COLUMN_TUTOR_NAME)) != null) {
                Tutor_Object tutor = new Tutor_Object();
                tutor.setFull_Name(c.getString(c.getColumnIndex(COLUMN_TUTOR_NAME)));
                tutor.setRating(c.getInt(c.getColumnIndex(COLUMN_TUTOR_RATING)));
                tutor.setTutor_id(c.getInt(c.getColumnIndex(COLUMN_TUTOR_ID)));
                tutors.add(tutor);
                c.moveToNext();


            }
        }
        return tutors;
    }


    public int getTutorCount() {
        SQLiteDatabase db = getReadableDatabase();
        long cnt = DatabaseUtils.queryNumEntries(db, TABLE_NAME);
        return (int) cnt;
    }

}
