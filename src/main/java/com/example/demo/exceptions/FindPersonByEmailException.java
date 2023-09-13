package com.example.demo.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus()
public class FindPersonByEmailException extends RuntimeException{
    public FindPersonByEmailException(String message){
        super(message);
    }
}
