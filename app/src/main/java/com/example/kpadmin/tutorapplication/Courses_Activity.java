package com.example.kpadmin.tutorapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class Courses_Activity extends Activity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_list_activity);

        listView = (ListView) findViewById(R.id.list3);

        ArrayList<Courses_Object> courses = new ArrayList<>();

        Courses_Object temp = new Courses_Object();

        temp.setCourseName("CSE 12");

        courses.add(temp);

        Courses_Adapter adapter = new Courses_Adapter(this, courses);
        listView.setAdapter(adapter);

    }

}
