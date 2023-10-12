package com.example.demo.mailer.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
@Setter@Getter
public class Recipient {
    private String name;
    private String email;
}
