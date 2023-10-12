package com.example.demo.learnMail.dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter@Getter
public class MailRequest {
    private Sender sender;
    @JsonProperty("to")
    private List<ToReceiver> toReceiver;
    private String subject;
    @JsonProperty("htmlContent")
    private String content;

    public MailRequest(){
        this.sender = new Sender("Oladele", "leumasre@hotmail.com");
    }
}
