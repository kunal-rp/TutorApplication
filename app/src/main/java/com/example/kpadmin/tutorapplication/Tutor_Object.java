package com.example.kpadmin.tutorapplication;

/**
 * Created by KP Admin on 10/22/2016.
 */

public class Tutor_Object  {

    private String  Full_Name;
    private double Rating;
    private int tutor_id;

    public int getTutor_id() {
        return tutor_id;
    }

    public void setTutor_id(int tutor_id) {
        this.tutor_id = tutor_id;
    }

    public String getFull_Name() {
        return Full_Name;
    }

    public void setFull_Name(String full_Name) {
        Full_Name = full_Name;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }
}
