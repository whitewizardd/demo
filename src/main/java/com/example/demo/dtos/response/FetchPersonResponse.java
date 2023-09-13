package com.example.demo.dtos.response;

import com.example.demo.data.models.Address;
import com.example.demo.data.models.Sex;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
@Builder
public class FetchPersonResponse {
    private String firstName;
    private String lastName;
    private String email;
    private Sex sex;
    private String phoneNumber;
    private Address address;
}
