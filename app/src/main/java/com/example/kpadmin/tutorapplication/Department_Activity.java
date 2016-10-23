package com.example.kpadmin.tutorapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class Department_Activity extends Activity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.departments_list_activity);

        listView = (ListView) findViewById(R.id.list2);
        ArrayList<Departments_Object> departments = new ArrayList<>();

            Departments_Object temp = new Departments_Object();
            temp.setDepName("1. Computer Science and Engineering");
            departments.add(temp);

        Departments_Adapter adapter = new Departments_Adapter(this, departments);
        listView.setAdapter(adapter);
    }
}
