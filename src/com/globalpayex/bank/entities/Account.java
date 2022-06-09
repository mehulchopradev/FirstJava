package com.globalpayex.bank.entities;

import com.globalpayex.bank.exceptions.MinBalNotMaintainedException;

public class Account {

    String accType;

    String accNumber;

    double balance;

    public Account(String accType, String accNumber, double balance) {
        this.accType = accType;
        this.accNumber = accNumber;
        this.balance = balance;
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
}
