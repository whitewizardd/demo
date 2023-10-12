package com.example.demo.services.learnMaill;


import com.example.demo.learnMail.dto.request.MailRequest;
import com.example.demo.learnMail.dto.request.ToReceiver;
import com.example.demo.learnMail.dto.response.MailResponse;
import com.example.demo.learnMail.service.MailingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MailTest {

    @Autowired
    private MailingService mailingService;
    @Test
    public void testThatMailCanBeSent(){
        ToReceiver toReceiver = new ToReceiver();
        toReceiver.setName("name");
        toReceiver.setEmail("leumasre@gmail.com");
        ToReceiver anotherToReceiver = new ToReceiver();
        anotherToReceiver.setName("name");
        anotherToReceiver.setEmail("banjo.oladele.samuel@gmail.com");
        MailRequest mailRequest = new MailRequest();
        mailRequest.setSubject("Welcome Home");
        mailRequest.setContent("Dear whatever welcome to our platform... here is our we do things here.");
        mailRequest.setToReceiver(List.of(toReceiver, anotherToReceiver));
        MailResponse mailResponse = mailingService.sendMail(mailRequest);
        assertEquals(201, mailResponse.getStatusCode());
    }
}
