package com.example.kpadmin.tutorapplication;

/**
 * Created by mlh-user on 10/22/16.
 */

public class User_Object {


        private String name;
        private String dep;
        private String uni;

        public User_Object(){
            name = "Unknown";
            dep = "Unknown";
            uni = "Unknown";
        }

        public User_Object(String user_name, String user_uni, String user_dep){
            name = user_name;
            uni = user_uni;
            dep = user_dep;
        }

        public String getName(){
            return name;
        }

        public String getUni(){
            return uni;
        }

        public String getDep(){
            return dep;
        }

        public void setName(String user_name){
            name = user_name;
        }

        public void setUni(String user_uni){
            uni = user_uni;
        }

        public void setDep(String user_dep){
            dep = user_dep;
        }

}
