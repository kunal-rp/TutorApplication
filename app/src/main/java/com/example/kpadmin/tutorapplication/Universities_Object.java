package com.example.kpadmin.tutorapplication;

import java.util.ArrayList;



public class Universities_Object {

    private String uniName;
    private ArrayList<Departments_Object> departments = new ArrayList<>();


    public String getUniName() {

        return uniName;

    }

    public void setUniName(String nm) {

        uniName = nm;

    }

    public ArrayList<Departments_Object> getDepartments() {

        return new ArrayList<Departments_Object>(departments);

    }

    /*
    public void setDepartments(ArrayList<Departments_Object> departs) {

        departments = departs;
    }
    */

}
