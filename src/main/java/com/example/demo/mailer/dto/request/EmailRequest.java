package com.example.demo.mailer.dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

import java.util.List;

@Setter
public class EmailRequest {
    private Sender sender;
    @JsonProperty("to")
    private List<Recipient> recipient;
    private String subject;
    @JsonProperty("htmlContent")
    private String content;

    public EmailRequest(){
        this.sender = new Sender("DleexTech", "sample@email.com");
    }
}
