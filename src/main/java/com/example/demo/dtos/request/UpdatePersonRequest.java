package com.example.demo.dtos.request;

import com.example.demo.data.models.Address;
import com.example.demo.data.models.Sex;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class UpdatePersonRequest {
    private String firstName;
    private String lastName;
    private Sex sex;
    private Address address;
}
