package com.example.personapi.exceptions;

public class ItemNotFoundException extends IllegalArgumentException {
    public ItemNotFoundException(String s) {
        super(s);
    }
}
