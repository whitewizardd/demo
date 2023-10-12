package com.example.demo.learnMail.dto.request;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter
@NoArgsConstructor
public class ToReceiver {
    private String name;
    private String email;
}
