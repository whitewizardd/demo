package com.example.demo.mailer.services;

import com.example.demo.mailer.config.MailConfig;
import com.example.demo.mailer.dto.request.EmailRequest;
import com.example.demo.mailer.dto.response.EmailResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;


@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements MailService{
    private final MailConfig mailConfig;
    @Override
    public EmailResponse sendMail(EmailRequest emailRequest){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("api-key", mailConfig.getApiKey());
        HttpEntity<EmailRequest> entity = new RequestEntity<>(emailRequest, httpHeaders, HttpMethod.POST, URI.create(""));
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<EmailResponse> responseResponseEntity =
                restTemplate.postForEntity(mailConfig.getMailUrl(), entity,EmailResponse.class);
        var response = responseResponseEntity.getBody();
        response.setStatusCode(responseResponseEntity.getStatusCode().value());
        return response;
    }
}
