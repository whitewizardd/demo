package com.example.demo.services;

import com.example.demo.dtos.request.CreatePersonRequest;
import com.example.demo.dtos.request.UpdatePersonRequest;
import com.example.demo.dtos.response.CreatePersonResponse;
import com.example.demo.dtos.response.FetchPersonResponse;
import com.example.demo.dtos.response.UpdatePersonResponse;

public interface PersonServices {
    CreatePersonResponse createPerson(CreatePersonRequest userDto);
    FetchPersonResponse getPersonByMail(String email);
    UpdatePersonResponse updatePerson(String personId, UpdatePersonRequest updatePersonRequest);
    String deleteUser(String personId);
}
