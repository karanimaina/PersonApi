package com.example.personapi.exception;

public class ItemAlreadyExistsException extends IllegalArgumentException {
    public ItemAlreadyExistsException(String s) {
        super(s);
    }
}
