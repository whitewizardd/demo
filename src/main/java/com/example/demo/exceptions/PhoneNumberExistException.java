package com.example.demo.exceptions;

public class PhoneNumberExistException extends RuntimeException{
    public PhoneNumberExistException(String message){
        super(message);
    }
}
