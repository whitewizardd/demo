package com.example.demo.utils;

import com.example.demo.dtos.request.CreatePersonRequest;
import com.example.demo.exceptions.EmptyInputException;
import com.example.demo.exceptions.InvalidInputEmailException;
import com.example.demo.exceptions.InvalidPhoneNumberException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandleException {
    public static void checkInput(CreatePersonRequest request){
        String regex = "@";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(request.getEmail());
        if (!matcher.find()) throw new InvalidInputEmailException("enter correct email...");
        checkMobileNumber(request);
    }
    private static  void checkMobileNumber(CreatePersonRequest request){
        String regex = "[0-9](11)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(request.getPhoneNumber());
        if (!matcher.find()) throw new InvalidPhoneNumberException("invalid mobile number, try again...");
        checkForNull(request);
    }
    private static void checkForNull(CreatePersonRequest request){
        if (request.getEmail() == null || request.getPhoneNumber() == null
                || request.getSex() == null || request.getLastName() == null ||
                request.getFirstName() == null) throw new EmptyInputException("input cannot be empty...");
    }
}
