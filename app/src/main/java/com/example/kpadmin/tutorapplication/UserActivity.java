package com.example.kpadmin.tutorapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    User_Object user0 = new User_Object("George Park", "CSE department", "University of California, San Diego");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        TextView user_name, dep_name, uni_name;

        user_name = (TextView) findViewById(R.id.userName);
        dep_name =  (TextView) findViewById(R.id.depName);
        uni_name = (TextView) findViewById(R.id.uniName);

        user_name.setText(user0.getName());
        dep_name.setText(user0.getDep());
        uni_name.setText(user0.getUni());

    }
}
