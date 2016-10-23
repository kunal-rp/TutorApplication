package com.example.kpadmin.tutorapplication;

import java.util.ArrayList;

public class Departments_Object {

    private String depName;
    private ArrayList<Courses_Object> courses = new ArrayList<>();


    public String getDepName() {

        return depName;

    }

    public void setDepName(String nm) {

        depName = nm;

    }

    public ArrayList<Courses_Object> getCourses() {

        return new ArrayList<Courses_Object>(courses);

    }

    /*
    public void setDepartments(ArrayList<Courses_Object> cos) {

        courses = cos;
    }
    */

}
