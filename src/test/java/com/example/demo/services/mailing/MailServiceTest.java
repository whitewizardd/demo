package com.example.demo.services.mailing;

import com.example.demo.mailer.dto.request.EmailRequest;
import com.example.demo.mailer.dto.response.EmailResponse;
import com.example.demo.mailer.dto.request.Recipient;
import com.example.demo.mailer.services.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MailServiceTest {
    @Autowired
    private MailService mailService;


    @Test
    public void testThatEmailCanBeSent(){
        Recipient recipient = new Recipient();
        recipient.setName("Stergen");
        recipient.setEmail("lonigi6225@dixiser.com");
        EmailRequest emailRequest = new EmailRequest();
        emailRequest.setRecipient(List.of(recipient));
        emailRequest.setSubject("learning mail using an external api");
        emailRequest.setContent("Dear "+ recipient.getName()+" this is the body of the mail sent out kindly respond");
        EmailResponse response = mailService.sendMail(emailRequest);
        assertNotNull(response);
        assertEquals(201, response.getStatusCode());
        System.out.println(response.getMessage());
        assertNotNull(response.getMessage());
    }
}
