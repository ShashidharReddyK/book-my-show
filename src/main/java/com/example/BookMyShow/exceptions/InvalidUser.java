package com.example.BookMyShow.exceptions;

public class InvalidUser extends Exception{

    public InvalidUser() {
    }

    public InvalidUser(String message) {
        super(message);
    }
}
