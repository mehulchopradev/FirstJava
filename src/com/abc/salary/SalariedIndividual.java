package com.abc.salary;

public interface SalariedIndividual {

    // are by default public abstract
    int getNoOfDaysWorked();

    double getPricePerDay();

    public default double calculate() {
        int noOfDays = this.getNoOfDaysWorked();
        double costPerDay = this.getPricePerDay();

        double costWithoutTax = noOfDays * costPerDay;
        int professionalTax = 200;
        double costWithTdsDeducted = costWithoutTax - (0.1 * costWithoutTax);
        return costWithTdsDeducted - professionalTax;
    }
}
