package com.example.demo.learnMail.config;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class MailingConfig {
    @Value("${mail.api.key}")
    private String apiKey;
    @Value("${brevo.mail.url}")
    private String mailApi;
}
