package com.globalpayex.college.entities;

public class Professor extends CollegeUser {

    String[] subjects;

    public Professor(String name, char gender, String[] subjects) {
        // this --> Professor object
        // super()
        // Internally
        // CollegeUser(this)

        super(name, gender);
        this.subjects = subjects;
    }
}
