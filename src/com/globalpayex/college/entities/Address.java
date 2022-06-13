package com.globalpayex.college.entities;

public class Address {

    private String country;

    private String state;

    private int postalCode;

    public Address(String country, String state, int postalCode) {
        this.country = country;
        this.state = state;
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getDetails() {
        return String.format("Country: %s\nState: %s\nPostal Code: %s", this.country, this.state, this.postalCode);
    }
}
