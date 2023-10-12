package com.example.demo.learnMail.service;

import com.example.demo.learnMail.dto.request.MailRequest;
import com.example.demo.learnMail.dto.response.MailResponse;

public interface MailingService {
    MailResponse sendMail(MailRequest mailRequest);
}
