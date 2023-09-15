package com.example.demo.controllers;

import com.example.demo.exceptions.*;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import java.net.BindException;
import java.util.Date;
@ControllerAdvice
public class HandlerException {
//    @ExceptionHandler(value = InvalidInputEmailException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ResponseBody
//    public ResponseEntity<ErrorMessage> handleInvalidEmailException(InvalidInputEmailException exception, WebRequest request){
//        ErrorMessage errorMessage = new ErrorMessage(
//                HttpStatus.BAD_REQUEST.value(),
//                new Date(),
//                exception.getMessage(),
//                request.getDescription(false));
//        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessage);
//    }
//    @ExceptionHandler(ExistingEmailException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ResponseBody
//    public ResponseEntity<ErrorMessage> handleExistingEmailException(ExistingEmailException exception, WebRequest request){
//        ErrorMessage errorMessage = new ErrorMessage(
//                HttpStatus.BAD_REQUEST.value(),
//                new Date(),
//                exception.getMessage(),
//                request.getDescription(false));
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
//    }
//    @ExceptionHandler(InvalidPhoneNumberException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ResponseBody
//    public ResponseEntity<ErrorMessage> handelMobileNumberException(InvalidPhoneNumberException exception, WebRequest request){
//        ErrorMessage errorMessage = new ErrorMessage(
//                HttpStatus.CONFLICT.value(),
//                new Date(),
//                exception.getMessage(),
//                request.getDescription(false));
//        return new ResponseEntity<>(errorMessage, HttpStatus.CONFLICT);
////        return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getMessage());
//    }
//    @ExceptionHandler(FindPersonByEmailException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ResponseBody
//    public ResponseEntity<ErrorMessage> handleFetchError(FindPersonByEmailException exception, WebRequest request){
//        ErrorMessage errorMessage = new ErrorMessage(
//                HttpStatus.CONFLICT.value(),
//                new Date(),
//                exception.getMessage(),
//                request.getDescription(false));
//        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//    @ExceptionHandler(value = EmptyInputException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ResponseBody
//    public ResponseEntity<ErrorMessage> handleEmptyFieldException(EmptyInputException exception, WebRequest request){
//        ErrorMessage errorMessage = new ErrorMessage(
//                HttpStatus.CONFLICT.value(),
//                new Date(),
//                exception.getMessage(),
//                request.getDescription(false));
//        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessage);
//    }
//    @ExceptionHandler(value = ConstraintViolationException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ResponseBody
//    public ResponseEntity<ErrorMessage> handleExceptionBean(ConstraintViolationException exception, WebRequest request){
//        ErrorMessage errorMessage = new ErrorMessage(
//                HttpStatus.BAD_REQUEST.value(),
//                new Date(),
//                exception.getMessage(),
//                request.getDescription(false)
//        );
//        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//    @ExceptionHandler(PhoneNumberExistException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ResponseBody
//    public ResponseEntity<ErrorMessage> handleException(PhoneNumberExistException exception, WebRequest request){
//        ErrorMessage errorMessage = new ErrorMessage(
//                HttpStatus.BAD_REQUEST.value(),
//                new Date(),
//                exception.getMessage(),
//                request.getDescription(false)
//        );
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
//    }
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ResponseBody
//    public ResponseEntity<ErrorMessage> handleException(MethodArgumentNotValidException exception, WebRequest request){
//        ErrorMessage errorMessage = new ErrorMessage(
//                HttpStatus.FORBIDDEN.value(),
//                new Date(),
//                exception.getMessage(),
//                request.getDescription(false)
//        );
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
//    }
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorMessage> handleAllException(Exception exception, WebRequest request){
        ErrorMessage errorMessage = new ErrorMessage(
                HttpStatus.FORBIDDEN.value(),
                new Date(),
                exception.getMessage(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
}
