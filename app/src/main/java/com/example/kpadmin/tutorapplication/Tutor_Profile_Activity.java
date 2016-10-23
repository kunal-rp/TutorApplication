package com.example.kpadmin.tutorapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by KP Admin on 10/22/2016.
 */

public class Tutor_Profile_Activity extends AppCompatActivity{

    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutor_profile_activity);

        dbHandler = new DBHandler(this);

        Intent intent = getIntent();
        int id = intent.getIntExtra("tutor_id",0);
        Tutor_Object tutor = dbHandler.getTutor(id);

        TextView profile_name = (TextView) findViewById(R.id.profile_tutor_name);
        TextView profile_rating = (TextView) findViewById(R.id.profile_tutor_rating);

        profile_name.setText(tutor.getFull_Name());
        profile_rating.setText(String.valueOf(tutor.getRating()));

    }

}
