package com.example.demo.learnMail.service;


import com.example.demo.learnMail.config.MailingConfig;
import com.example.demo.learnMail.dto.request.MailRequest;
import com.example.demo.learnMail.dto.response.MailResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;


@Service
@AllArgsConstructor
public class BrevoMailingService implements MailingService{
    private final MailingConfig mailingConfig;
    @Override
    public MailResponse sendMail(MailRequest mailRequest){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("api-key", mailingConfig.getApiKey());
        HttpEntity<MailRequest> mailRequestEntity = new RequestEntity<>(mailRequest, httpHeaders, HttpMethod.POST, URI.create(""));
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<MailResponse> mailResponse = restTemplate.postForEntity(mailingConfig.getMailApi(),mailRequestEntity, MailResponse.class);
        MailResponse response = mailResponse.getBody();
        response.setStatusCode(mailResponse.getStatusCode().value());
        return response;
    }
}
