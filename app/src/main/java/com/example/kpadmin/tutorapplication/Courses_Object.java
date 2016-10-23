package com.example.kpadmin.tutorapplication;

import java.util.ArrayList;

public class Courses_Object {

    private String courseName;
    private ArrayList<Tutor_Object> tutors = new ArrayList<>();


    public String getCourseName() {

        return courseName;

    }

    public void setCourseName(String nm) {

        courseName = nm;

    }

    public ArrayList<Tutor_Object> getTutors() {

        return new ArrayList<Tutor_Object>(tutors);

    }

    /*
    public void setTutors(ArrayList<Tutor_Object> tut) {

        tutors = tut;
    }
    */

}
