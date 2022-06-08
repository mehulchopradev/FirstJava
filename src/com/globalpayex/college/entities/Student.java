package com.globalpayex.college.entities;

public class Student extends CollegeUser {
    int roll;
    float marks;

    public Student(String name, char gender, int roll, float marks) {
        // super(); // Calls the super class constructor
        // Internally
        // CollegeUser(this)

        super(name, gender);
        // Internally
        // CollegeUser(name, gender)

        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String getDetails() {
        var str1 = super.getDetails();
        // Internally
        // CollegeUser.getDetails(this);

        return String.format("%s\nRoll: %s\nMarks: %s",
                str1, this.roll, this.marks);
    }
}
