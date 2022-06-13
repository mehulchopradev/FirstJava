package com.globalpayex.college.entities;

public class CollegeUser { // by default extends from Object

    public String name;

    // 1. Can be accessed from a class outside the package provided its the derived class
    // 2. Can be accessed from a class within the same package (need not be derived class)
    protected char gender;

    // Composition
    // HAS-A
    // Student HAS-A Address
    // Professor HAS-A Address
    private Address address;

    /*
     CollegeUser() {
        // this ---> Student object, Professor object
     }
    */

    public CollegeUser(String name, char gender) {
        // this --> Student, Professor, subclass object of CollegeUser
        // super();
        this(name, gender, null);
    }

    public CollegeUser(String name, char gender, Address address) {
        // this --> Student, Professor, subclass object of CollegeUser
        // super();
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public final char getGender() {
        return gender;
    }

    public String getDetails() {
        // this ---> Student object, Professor object, subclass CollegeUser
        return String.format("Name: %s\nGender: %s\nAddress:%s",
                this.name, this.gender, this.address != null ? this.address.getDetails() : "NA");
    }

    public boolean isAddressPresent() {
        return this.address != null;
    }

    @Override
    public String toString() {
        return "CollegeUser{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
