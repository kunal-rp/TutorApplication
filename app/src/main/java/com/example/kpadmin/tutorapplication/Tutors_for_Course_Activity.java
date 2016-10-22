package com.example.kpadmin.tutorapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Tutors_for_Course_Activity extends Activity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        listView = (ListView) findViewById(R.id.list);
        ArrayList<Tutor_Object> tutors = new ArrayList<>();
        for(int i = 0 ; i < 10; i++){
            Tutor_Object temp = new Tutor_Object();
            temp.setFull_Name(String.valueOf(i));
            temp.setRating((double)i/5);
            tutors.add(temp);
        }
        Tutors_for_Class_Adapter adapter = new Tutors_for_Class_Adapter(this, tutors);
        listView.setAdapter(adapter);
    }
}
