package com.example.demo.dtos.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
@Builder
public class CreatePersonResponse {
    private String id;
    private String email;
    private String message;
}
