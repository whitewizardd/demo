package com.example.demo.mailer.services;


import com.example.demo.mailer.dto.request.EmailRequest;
import com.example.demo.mailer.dto.response.EmailResponse;

public interface MailService {
    EmailResponse sendMail(EmailRequest emailRequest);
}
