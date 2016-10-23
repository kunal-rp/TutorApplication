package com.example.kpadmin.tutorapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Departments_Adapter extends ArrayAdapter<Departments_Object> {

    public Departments_Adapter(Context context, ArrayList<Departments_Object> Departments_object) {
        super(context, R.layout.overview_subcategories, Departments_object);
    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());

        View customView = inflater.inflate(R.layout.overview_subcategories, parent,false);

        Departments_Object current_department = getItem(position);

        TextView name = (TextView) customView.findViewById(R.id.subcategories);

        name.setText(current_department.getDepName());

        return customView;
    }

}
