package com.example.demo.dtos.request;

import com.example.demo.data.models.Sex;
//import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter@Getter
@Builder
public class CreatePersonRequest {
//    @NotNull(message = "this is required")
//    @NotBlank(message = "first name cannot be blank")
//    @NotEmpty(message = "this field is required")
    private String firstName;
//    @NotNull(message = "last name is required")
//    @NotBlank(message = "last name is required")
//    @NotEmpty(message = "last name is required")
    private String lastName;
//    @NotNull(message = "this field is required")
//    @NotBlank(message = "this field is required")
//    @NotEmpty(message = "this field is required")
//    @Email(message = "Enter correct email address")
    private String email;
//    @NotNull(message = "this field is required")
//    @NotBlank(message = "this field is required")
//    @NotEmpty(message = "this field is required")
    private Sex sex;
    private String houseNumber;
    private String streetName;
    private String state;
//    @NotNull(message = "Enter phone number")
//    @NotBlank(message = "Enter phone number")
//    @NotEmpty(message = "Enter phone number")
//    @Pattern(regexp = "^(\\+234|234|0)(7|8|9)(0|1)\\d{8}$")
    private String phoneNumber;
}
