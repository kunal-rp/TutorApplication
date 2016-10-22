package com.example.kpadmin.tutorapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Tutors_for_Course_Activity extends Activity {

    ListView listView;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        dbHandler = new DBHandler(this);
        listView = (ListView) findViewById(R.id.list);
        ArrayList<Tutor_Object> tutors = dbHandler.getallTutors();


        Tutors_for_Class_Adapter adapter = new Tutors_for_Class_Adapter(this, tutors);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Tutor_Object temp = (Tutor_Object) parent.getAdapter().getItem(position);
                Intent intent = new Intent(getApplicationContext(), Tutor_Profile_Activity.class);
                intent.putExtra("tutor_id",temp.getTutor_id());
                startActivity(intent);
            }



        });

    }


}
