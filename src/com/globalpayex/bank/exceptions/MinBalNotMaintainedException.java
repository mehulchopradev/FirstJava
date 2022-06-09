package com.globalpayex.bank.exceptions;

// Compiler checked exception
public class MinBalNotMaintainedException extends Exception {

    public MinBalNotMaintainedException(String message) {
        super(message);
    }
}
