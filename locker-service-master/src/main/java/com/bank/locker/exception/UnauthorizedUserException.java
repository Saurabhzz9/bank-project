package com.bank.locker.exception;

public class UnauthorizedUserException extends RuntimeException {
    public UnauthorizedUserException(String s) {
        super(s);
    }
}
