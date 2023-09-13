package com.example.demo.exceptions;
//@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "User with this email already exist")
public class ExistingEmailException extends RuntimeException{
    public ExistingEmailException(String message){
        super(message);
    }
}
