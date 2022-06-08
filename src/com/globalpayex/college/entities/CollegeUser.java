package com.globalpayex.college.entities;

public class CollegeUser { // by default extends from Object

    public String name;

    public char gender;

    /*
     CollegeUser() {
        // this ---> Student object, Professor object
     }
    */

    public CollegeUser(String name, char gender) {
        // this --> Student, Professor, subclass object of CollegeUser
        // super();
        this.name = name;
        this.gender = gender;
    }

    public String getDetails() {
        // this ---> Student object, Professor object, subclass CollegeUser
        return String.format("Name: %s\nGender: %s", this.name, this.gender);
    }

    @Override
    public String toString() {
        return "CollegeUser{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
