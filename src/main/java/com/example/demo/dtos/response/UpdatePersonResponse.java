package com.example.demo.dtos.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
@Builder
public class UpdatePersonResponse {
    private String id;
    private boolean status;
    private String message;
}
