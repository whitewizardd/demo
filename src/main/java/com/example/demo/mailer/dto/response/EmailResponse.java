package com.example.demo.mailer.dto.response;


import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class EmailResponse {
    private String message;
    private Integer statusCode;
}
