package com.example.demo.dtos.request;

import com.example.demo.data.models.Address;
import com.example.demo.data.models.Sex;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class UpdatePersonRequest {
//    @NotNull(message = "this field is required")
//    @NotBlank(message = "this field is required")
//    @NotEmpty(message = "this field is required")
    private String firstName;
//    @NotNull(message = "this field is required")
//    @NotBlank(message = "this field is required")
//    @NotEmpty(message = "this field is required")
    private String lastName;
    private Sex sex;
    private Address address;
}
