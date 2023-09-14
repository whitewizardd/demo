package com.example.demo.controllers;

import com.example.demo.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
@ControllerAdvice
public class HandlerException {
    @ExceptionHandler(value = InvalidInputEmailException.class)
    public ResponseEntity<ErrorMessage> handleInvalidEmailException(InvalidInputEmailException exception, WebRequest request){
        ErrorMessage errorMessage = new ErrorMessage(
                HttpStatus.BAD_REQUEST.value(),
                new Date(),
                exception.getMessage(),
                request.getDescription(false));
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessage);
    }
    @ExceptionHandler(ExistingEmailException.class)
    public ResponseEntity<ErrorMessage> handleExistingEmailException(ExistingEmailException exception, WebRequest request){
        ErrorMessage errorMessage = new ErrorMessage(
                HttpStatus.BAD_REQUEST.value(),
                new Date(),
                exception.getMessage(),
                request.getDescription(false));
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
    }
    @ExceptionHandler(InvalidPhoneNumberException.class)
    public ResponseEntity<ErrorMessage> handelMobileNumberException(InvalidPhoneNumberException exception, WebRequest request){
        ErrorMessage errorMessage = new ErrorMessage(
                HttpStatus.CONFLICT.value(),
                new Date(),
                exception.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(errorMessage, HttpStatus.CONFLICT);
//        return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getMessage());
    }
    @ExceptionHandler(FindPersonByEmailException.class)
    public ResponseEntity<ErrorMessage> handleFetchError(FindPersonByEmailException exception, WebRequest request){
        ErrorMessage errorMessage = new ErrorMessage(
                HttpStatus.CONFLICT.value(),
                new Date(),
                exception.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(value = EmptyInputException.class)
    public ResponseEntity<ErrorMessage> handleEmptyFieldException(EmptyInputException exception, WebRequest request){
        ErrorMessage errorMessage = new ErrorMessage(
                HttpStatus.CONFLICT.value(),
                new Date(),
                exception.getMessage(),
                request.getDescription(false));
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessage);
    }
}
