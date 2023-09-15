package com.example.demo.utils;

import com.example.demo.data.models.Address;
import com.example.demo.data.models.Person;
import com.example.demo.dtos.request.CreatePersonRequest;
import com.example.demo.dtos.request.UpdatePersonRequest;
import com.example.demo.dtos.response.FetchPersonResponse;
import com.example.demo.exceptions.ExistingEmailException;
import com.example.demo.exceptions.PhoneNumberExistException;

import java.util.Optional;

public class Mapper {
    public static Person map(CreatePersonRequest userDto, Address savedAddress){
        return Person.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail().toLowerCase())
                .sex(userDto.getSex())
                .phoneNumber(map(userDto.getPhoneNumber()))
                .address(savedAddress)
                .build();
    }
    public static FetchPersonResponse map(Person person){
        return FetchPersonResponse.builder()
                .id(person.getId())
                .firstName(person.getFirstName())
                .lastName(person.getLastName())
                .email(person.getEmail())
                .sex(person.getSex())
                .phoneNumber(person.getPhoneNumber())
                .address(person.getAddress())
                .build();
    }
    public static Person map(Person person, UpdatePersonRequest updatePersonRequest, Address address){
        person.setFirstName(updatePersonRequest.getFirstName());
        person.setLastName(updatePersonRequest.getLastName());
        person.setSex(updatePersonRequest.getSex());
        person.setAddress(address);
        return person;
    }
    public static Address map(Address foundAddress,Address address){
        foundAddress.setId(foundAddress.getId());
        foundAddress.setState(address.getState());
        foundAddress.setHouseNumber(address.getHouseNumber());
        foundAddress.setStreetName(address.getStreetName());
        return foundAddress;
    }
    public static String map(String phoneNumber){
        if (phoneNumber.startsWith("+234")) return phoneNumber.substring(4);
        if (phoneNumber.startsWith("234")) return phoneNumber.substring(3);
        if (phoneNumber.startsWith("0")) return phoneNumber.substring(1);
        return null;
    }
}
