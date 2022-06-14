package com.globalpayex;

public enum AccType {
    SAVINGS("S"), // has an implicit integer value called as the ordinal (0)
    CURRENT("C"); // (1)

    private String actualValue;

    AccType(String actualValue) {
        this.actualValue = actualValue;
    }

    public String getActualValue() {
        return actualValue;
    }
}
