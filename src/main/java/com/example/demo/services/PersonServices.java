package com.example.demo.services;

import com.example.demo.data.models.Person;
import com.example.demo.dtos.request.CreatePersonRequest;
import com.example.demo.dtos.request.UpdatePersonRequest;
import com.example.demo.dtos.response.CreatePersonResponse;
import com.example.demo.dtos.response.FetchPersonResponse;
import com.example.demo.dtos.response.UpdatePersonResponse;

import java.util.List;

public interface PersonServices {
    CreatePersonResponse createPerson(CreatePersonRequest userDto);
    FetchPersonResponse getPersonByMail(String email);
    UpdatePersonResponse updatePerson(String personId, UpdatePersonRequest updatePersonRequest);
    String deleteUser(String personId);
    FetchPersonResponse getPersonByPhoneNumber(String phoneNumber);
    List<Person> getAllPersonsByLastName(String lastName);
    List<FetchPersonResponse> getAllPersonsByFirstName(String firstName);
}
