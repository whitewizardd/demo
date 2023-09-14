package com.example.demo.exceptions;

public class InvalidInputEmailException extends RuntimeException{
    public InvalidInputEmailException(String message){
        super(message);
    }
}
