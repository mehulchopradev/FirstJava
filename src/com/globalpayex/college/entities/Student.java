package com.globalpayex.college.entities;

import java.util.Objects;

public class Student extends CollegeUser {
    public int roll;
    public float marks;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}
