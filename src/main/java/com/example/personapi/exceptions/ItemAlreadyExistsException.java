package com.example.personapi.exceptions;

public class ItemAlreadyExistsException extends IllegalArgumentException {
    public ItemAlreadyExistsException(String s) {
        super(s);
    }
}
