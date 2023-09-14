package com.example.demo.exceptions;
import lombok.Getter;

import java.util.Date;

@Getter
public class ErrorMessage {
    private int statusCode;
    private Date date;
    private String message;
    private String description;
    public ErrorMessage(int statusCode, Date date, String message, String description) {
        this.statusCode = statusCode;
        this.date = date;
        this.message = message;
        this.description = description;
    }
}
