package com.example.demo.controllers;

import com.example.demo.data.models.Person;
import com.example.demo.dtos.request.CreatePersonRequest;
import com.example.demo.dtos.request.UpdatePersonRequest;
import com.example.demo.dtos.response.CreatePersonResponse;
import com.example.demo.dtos.response.FetchPersonResponse;
import com.example.demo.dtos.response.UpdatePersonResponse;
import com.example.demo.services.PersonServicesImpl;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping(value = "/api")
@RestController
public class PersonController {
    private final PersonServicesImpl personServices;
    public PersonController(PersonServicesImpl personServices) {
        this.personServices = personServices;
    }
    @PostMapping("/api")
    public ResponseEntity<CreatePersonResponse> createPerson(@RequestBody @Valid CreatePersonRequest createPersonRequest){
        CreatePersonResponse response = personServices.createPerson(createPersonRequest);
//        return ResponseEntity.status(HttpStatus.OK).body(response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("api/{user_id}")
    public ResponseEntity<FetchPersonResponse> getPersonByEmail(@PathVariable String user_id){
        FetchPersonResponse fetchPersonResponse = personServices.getPersonByMail(user_id);
//        return ResponseEntity.status(HttpStatus.OK).body(fetchPersonResponse);
        return new ResponseEntity<>(fetchPersonResponse, HttpStatus.OK);
    }
    @DeleteMapping("api/{user_id}")
    public ResponseEntity<String> deletePersonById(@PathVariable String user_id){
        return new ResponseEntity<>(personServices.deleteUser(user_id), HttpStatus.OK);
    }
    @PutMapping("api/{user_id}")
    public ResponseEntity<UpdatePersonResponse> updatePerson(@PathVariable String user_id, @Valid
                                                             @RequestBody UpdatePersonRequest updatePersonRequest){
        UpdatePersonResponse response = personServices.updatePerson(user_id, updatePersonRequest);
//        return ResponseEntity.status(HttpStatus.OK).body(response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("api/phone/{user_id}")
    public ResponseEntity<FetchPersonResponse> getPersonByPhone(@PathVariable String user_id){
        FetchPersonResponse response = personServices.getPersonByPhoneNumber(user_id);
//        return ResponseEntity.status(HttpStatus.OK).body(response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("api/name/{user_id}")
    public ResponseEntity<List<Person>> getPersonByName(@PathVariable String user_id){
        List<Person> people = personServices.getAllPersonsByLastName(user_id);
//        return ResponseEntity.status(HttpStatus.OK).body(people);
        return new ResponseEntity<>(people, HttpStatus.OK);
    }
}
