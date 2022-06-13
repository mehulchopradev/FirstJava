package com.globalpayex.college.entities;

import com.abc.salary.SalariedIndividual;

public class Professor extends CollegeUser implements SalariedIndividual {

    double costPerDay;

    int workingDays;

    String[] subjects;

    public Professor(String name, char gender, String[] subjects, double costPerDay, int workingDays) {
        // this --> Professor object
        // super()
        // Internally
        // CollegeUser(this)

        this(name, gender, subjects, costPerDay, workingDays, null);
    }

    public Professor(String name, char gender, String[] subjects, double costPerDay, int workingDays, Address address) {
        super(name, gender, address);
        this.subjects = subjects;
        this.costPerDay = costPerDay;
        this.workingDays = workingDays;
    }

    @Override
    public int getNoOfDaysWorked() {
        return this.workingDays;
    }

    @Override
    public double getPricePerDay() {
        return this.costPerDay;
    }
}
