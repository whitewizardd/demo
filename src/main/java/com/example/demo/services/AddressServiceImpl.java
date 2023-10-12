package com.example.demo.services;

import com.example.demo.data.models.Address;
import com.example.demo.data.repositories.AddressRepository;
import com.example.demo.dtos.request.CreatePersonRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.demo.utils.Mapper.map;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService{
//    private final AddressRepository addressRepository;
//    public AddressServiceImpl(AddressRepository addressRepository){
//        this.addressRepository = addressRepository;
//    }
    @Override
    public Address createAddress(CreatePersonRequest createPersonRequest) {
//        Address address = Address.builder()
//                .state(createPersonRequest.getState())
//                .houseNumber(createPersonRequest.getHouseNumber())
//                .streetName(createPersonRequest.getStreetName()).build();
//        return addressRepository.save(address);
        return null;
    }
    @Override
    public void deleteCorresponding(String id) {
//        addressRepository.deleteById(id);
    }
    @Override
    public Address updatePersonAddress(String id, Address address) {
//        Address foundAddress = addressRepository.findById(id).get();
//        Address updatedAddress = map(foundAddress, address);
//        return addressRepository.save(updatedAddress);
        return null;
    }
}
