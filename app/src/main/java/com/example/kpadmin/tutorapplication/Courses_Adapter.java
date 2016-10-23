package com.example.kpadmin.tutorapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class Courses_Adapter extends ArrayAdapter<Courses_Object> {

    public Courses_Adapter(Context context, ArrayList<Courses_Object> Courses_object) {
        super(context, R.layout.overview_subcategories, Courses_object);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());

        View customView = inflater.inflate(R.layout.overview_subcategories, parent,false);

        Courses_Object current_course = getItem(position);

        TextView name = (TextView) customView.findViewById(R.id.subcategories);

        name.setText(current_course.getCourseName());

        return customView;
    }

}
