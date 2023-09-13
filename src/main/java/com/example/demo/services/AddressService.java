package com.example.demo.services;

import com.example.demo.data.models.Address;
import com.example.demo.dtos.request.CreatePersonRequest;

public interface AddressService {
    Address createAddress(CreatePersonRequest createPersonRequest);
    void deleteCorresponding(String id);

    Address updatePersonAddress(String id, Address address);
}
