package com.example.kpadmin.tutorapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by KP Admin on 10/22/2016.
 */

public class Tutors_for_Class_Adapter extends ArrayAdapter<Tutor_Object>{

    public Tutors_for_Class_Adapter(Context context, ArrayList<Tutor_Object> tutor_objects) {
        super(context, R.layout.overview_tutor_object, tutor_objects);


    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());

        View customView = inflater.inflate(R.layout.overview_tutor_object, parent,false);

        Tutor_Object current_tutor = getItem(position);

        TextView name = (TextView) customView.findViewById(R.id.overview_name);
        TextView rating = (TextView) customView.findViewById(R.id.overview_rating);

        name.setText(current_tutor.getFull_Name());
        rating.setText(String.valueOf(current_tutor.getRating()));

        return customView;
    }
}
