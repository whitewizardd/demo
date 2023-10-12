package com.example.demo.services;

import com.example.demo.data.models.Address;
import com.example.demo.data.models.Person;
import com.example.demo.data.repositories.PersonRepository;
import com.example.demo.dtos.request.CreatePersonRequest;
import com.example.demo.dtos.request.UpdatePersonRequest;
import com.example.demo.dtos.response.CreatePersonResponse;
import com.example.demo.dtos.response.FetchPersonResponse;
import com.example.demo.dtos.response.UpdatePersonResponse;
import com.example.demo.exceptions.ExistingEmailException;
import com.example.demo.exceptions.FindPersonByEmailException;
import com.example.demo.exceptions.PhoneNumberExistException;
import com.example.demo.exceptions.UserNotExistException;
import com.example.demo.utils.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.example.demo.utils.Mapper.map;

@Service
public class PersonServicesImpl implements PersonServices{
//    private final PersonRepository personRepository;
//    private final AddressService addressService;
//    public PersonServicesImpl(PersonRepository personRepository, AddressService addressService){
//        this.personRepository = personRepository;
//        this.addressService = addressService;
//    }
    @Override
    public CreatePersonResponse createPerson(CreatePersonRequest userDto) {
//        check(userDto);
//        Address address = addressService.createAddress(userDto);
//        Person person = map(userDto, address);
//        Person savedPerson = personRepository.save(person);
//        return CreatePersonResponse.builder()
//                .id(savedPerson.getId())
//                .email(savedPerson.getEmail())
//                .status(true)
//                .message("Saved Successfully...").build();
        return null;
    }
    @Override
    public FetchPersonResponse getPersonByMail(String email) {
        Person person = findPersonViaEmail(email);
        return map(person);
    }
    @Override
    public UpdatePersonResponse updatePerson(String personId, UpdatePersonRequest updatePersonRequest) {
//        Person person = findPersonViaEmail(personId);
//        Address address = addressService.updatePersonAddress(person.getAddress().getId(), updatePersonRequest.getAddress());
//        Person updatedPerson = map(person, updatePersonRequest, address);
//        Person savedPerson = personRepository.save(updatedPerson);
//        return UpdatePersonResponse.builder()
//                .id(savedPerson.getId())
//                .status(true)
//                .message(savedPerson.getEmail() + " Successfully updated...").build();
        return null;
    }
    @Override
    public String deleteUser(String personId) {
//        Person person = findPersonViaEmail(personId);
//        addressService.deleteCorresponding(person.getAddress().getId());
//        personRepository.delete(person);
//        return person.getEmail() + " Successfully deleted";
        return "";
    }
    @Override
    public FetchPersonResponse getPersonByPhoneNumber(String phoneNumber) {
//        String findPhone = map(phoneNumber);
//        Optional<Person> foundPerson = personRepository.findByPhoneNumber(findPhone);
//        if (foundPerson.isEmpty()){
//            throw new PhoneNumberExistException("User with this phone number does not exist");
//        }
//        return map(foundPerson.get());
        return null;
    }
    @Override
    public List<Person> getAllPersonsByLastName(String lastName) {
//        List<Person> allPerson = personRepository.findByLastNameIgnoreCase(lastName);
//        if (allPerson.isEmpty()) throw new UserNotExistException("User(s) with the name "+ lastName + " does not exist");
//        return allPerson;
        return null;
    }
    @Override
    public List<FetchPersonResponse> getAllPersonsByFirstName(String firstName) {
//        Optional<List<Person>> allPerson = personRepository.findByFirstName(firstName);
        return null;
    }
    private Person findPersonViaEmail(String email){
//        Optional<Person> person = personRepository.findByEmail(email);
//        if (person.isEmpty()) throw new FindPersonByEmailException("User with " + email+ " does not exist");
//        return person.get();
        return null;
    }
    private void check(CreatePersonRequest userDto){
//        Optional<Person> checkExistingEmail = personRepository.findByEmail(userDto.getEmail().toLowerCase());
//        Optional<Person> checkPhoneNumber = personRepository.findByPhoneNumber(map(userDto.getPhoneNumber()));
//        if (checkPhoneNumber.isPresent()) throw new PhoneNumberExistException("User with this mobile number already exist");
//        if (checkExistingEmail.isPresent()) throw new ExistingEmailException("User with this email already exist");
    }
}
