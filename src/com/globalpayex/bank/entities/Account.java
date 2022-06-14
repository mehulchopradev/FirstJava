package com.globalpayex.bank.entities;

import com.globalpayex.AccType;
import com.globalpayex.Constants;
import com.globalpayex.bank.exceptions.MinBalNotMaintainedException;

import static com.globalpayex.Constants.*;

import java.util.Optional;

public class Account {

    // Forced Encapsulation
    // As a convention and to ensure that your java classes work seamlessly with the frameworks/libraries used,
    // 1. All instance attributes must be declared as private
    // 2. All instance attributes must have public getter/setter methods

    // Savings, Current
    // private String accType;
    private AccType accType;

    public String accNumber;

    private double balance;

    /* public Account(String accType, String accNumber, double balance) {
        this.accType = accType;
        this.accNumber = accNumber;
        this.balance = balance;
    } */

    public Account(AccType accType, String accNumber, double balance) {
        this.accType = accType;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        if (balance < 1000) {
            throw new IllegalArgumentException("balance to be 1000 or more");
        }
        this.balance = balance;
    }

    // setter
    /* public void setAccType(String accType) {
        if (accType.equals(ACC_TYPE_SAVINGS) || accType.equals(ACC_TYPE_CURRENT)) {
            this.accType = accType;
        } else {
            throw new IllegalArgumentException("accType must be one of the following: Savings/Current");
        }
    }

    // getter
    public String getAccType() {
        return this.accType.toUpperCase();
    } */

    public void setAccType(AccType accType) {
        this.accType = accType;
    }

    public AccType getAccType() {
        return accType;
    }

    public double withdraw(double amt) throws MinBalNotMaintainedException {
        // e.g. withdraw() opens connection to a file
        System.out.println("Transaction starts...");

        try {
            if (amt <= 0) {
                throw new IllegalArgumentException("Withdrawl amount must be more than 0");
            }

            if (this.balance - amt < 1000) {
                // throw an exception to the caller
                // throw new IllegalStateException("Balance cannot go below 1000");
                throw new MinBalNotMaintainedException("Balance cannot go below 1000");
            }

            this.balance -= amt;
            return this.balance;
        } finally {
            // e.g. withdraw() closes connection to a file
            System.out.println("Transaction ends..");
        }
    }

    public double deposit(double amt) {
        this.balance += amt;
        return this.balance;
    }

    /* public String getDetails() {
        if (this.accNumber != null && !this.accNumber.equals("") && this.accType != null &&
         !this.accType.equals("")) {
            return String.format("Acc no: %s\nAcc Type: %s\nBal: %s", this.accNumber, this.accType, this.balance);
        }

        return null;
    } */

    /* public Optional<String> getDetails() {
        if (this.accNumber != null && !this.accNumber.equals("") && this.accType != null &&
                !this.accType.equals("")) {
            return Optional.of(String.format("Acc no: %s\nAcc Type: %s\nBal: %s", this.accNumber, this.getAccType(), this.balance));
        }

        return Optional.empty();
    } */

    public Optional<String> getDetails() {
        if (this.accNumber != null && !this.accNumber.equals("") && this.accType != null) {
            return Optional.of(String.format("Acc no: %s\nAcc Type: %s\nBal: %s",
                    this.accNumber, this.accType.getActualValue(), this.balance));
        }

        return Optional.empty();
    }

    /* public boolean hasInterest() {
        return this.accType.equals(ACC_TYPE_SAVINGS);
    } */

    public boolean hasInterest() {
        return this.accType == AccType.SAVINGS;
    }
}
