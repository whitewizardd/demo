package com.example.demo.mailer.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class MailConfig {
    @Value("${brevo.mail.url}")
    private String mailUrl;
    @Value("${mail.smpt.api.key}")
    private String apiKey;
}
