package com.example.personapi.exception;

public class ItemNotFoundException extends IllegalArgumentException {
    public ItemNotFoundException(String s) {
        super(s);
    }
}
