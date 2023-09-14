package com.example.demo.controllers;

import com.example.demo.dtos.request.CreatePersonRequest;
import com.example.demo.dtos.request.UpdatePersonRequest;
import com.example.demo.dtos.response.CreatePersonResponse;
import com.example.demo.dtos.response.FetchPersonResponse;
import com.example.demo.dtos.response.UpdatePersonResponse;
import com.example.demo.services.PersonServicesImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PersonController {
    private final PersonServicesImpl personServices;
    public PersonController(PersonServicesImpl personServices){
        this.personServices = personServices;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<CreatePersonResponse> createPerson(@RequestBody CreatePersonRequest createPersonRequest){
        CreatePersonResponse response = personServices.createPerson(createPersonRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @RequestMapping(value = "/{user_id}", method = RequestMethod.GET)
    public ResponseEntity<FetchPersonResponse> getPersonByEmail(@PathVariable String user_id){
        FetchPersonResponse fetchPersonResponse = personServices.getPersonByMail(user_id);
        return ResponseEntity.status(HttpStatus.CREATED).body(fetchPersonResponse);
    }
    @RequestMapping(value = "/{user_id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deletePersonById(@PathVariable String user_id){
        return new ResponseEntity<>(personServices.deleteUser(user_id), HttpStatus.OK);
    }
    @RequestMapping(value = "/{user_id}", method = RequestMethod.PUT)
    public ResponseEntity<UpdatePersonResponse> updatePerson(@PathVariable String user_id,
                                                             @RequestBody UpdatePersonRequest updatePersonRequest){
        UpdatePersonResponse response = personServices.updatePerson(user_id, updatePersonRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
