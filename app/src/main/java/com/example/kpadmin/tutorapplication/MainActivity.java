package com.example.kpadmin.tutorapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHandler = new DBHandler(this);
        if(dbHandler.getTutorCount() == 0) {


            for (int i = 0; i < 10; i++) {
                Tutor_Object temp = new Tutor_Object();
                temp.setFull_Name(String.valueOf(i));
                temp.setRating((double) i / 5);
                dbHandler.addTutor(temp);
            }
        }

    }

    public void showTutorsForClass(View view){
        Intent intent = new Intent(this, Tutors_for_Course_Activity.class);
        startActivity(intent);
<<<<<<< HEAD
=======
    }

    public void showUserProfile(View view){
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
>>>>>>> b1996099f6acd716a929128c9d8e8d187205235e
    }
}
