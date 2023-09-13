package com.example.demo.dtos.request;

import com.example.demo.data.models.Address;
import com.example.demo.data.models.Sex;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
@Builder
public class CreatePersonRequest {
    private String firstName;
    private String lastName;
    private String email;
    private Sex sex;
    private String houseNumber;
    private String streetName;
    private String state;
    private String phoneNumber;
}
