package com.globalpayex.college.entities;

public class StudentOld {

    // instance attributes
    String name;
    char gender;
    int roll;
    float marks;

    // class attribute
    public static int count;

    // by default
    /* com.globalpayex.college.entities.Student(com.globalpayex.college.entities.Student this) {

        return this;
    } */

    // overloaded constructors
    public StudentOld() {
        // must be the first statement in a constructor
        this("NA", 'm', -1, 0.0f);
    }

    // constructor
    public StudentOld(String name, char gender, int roll, float marks) {
        // implicit parameter this --> current object
        this.name = name;
        this.gender = gender;
        this.roll = roll;
        this.marks = marks;
        ++StudentOld.count;
    }

    public String getDetails() {
        // Implicit paramter called as `this`--> s1, s2, s3 ---> current object
        /* return "Name: " + this.name + "\nGender: " + this.gender +
                "\nRoll: " + this.roll + "\nMarks: " + this.marks; */

        return String.format("Name: %s\nGender: %s\nRoll: %s\nMarks: %s",
                this.name, this.gender, this.roll, this.marks);
    }

    public char getGrade() {
        char grade;
        var marks = this.marks;
        if (marks < 0 || marks > 100) {
            grade = 'I';
        } else if (marks >= 70) {
            grade = 'A';
        } else if (marks >= 60) {
            grade = 'B';
        } else if (marks >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        return grade;
    }

    /*
    // Internally
    String getDetails(com.globalpayex.college.entities.Student this) {

    }
    */

    public static StudentOld newInstance(String name, char gender, int roll, float marks) {
        // System.out.println(this); // no `this` in a static function
        return new StudentOld(name, gender, roll, marks);
    }

    public String getNameGender() {
        return "Name: " + this.name + "\nGender: " + this.gender;
    }
}
