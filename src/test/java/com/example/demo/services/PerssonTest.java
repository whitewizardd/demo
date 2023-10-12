package com.example.demo.services;

import com.example.demo.DemoApplication;
import com.example.demo.data.models.Address;
import com.example.demo.data.models.Sex;
import com.example.demo.data.repositories.PersonRepository;
import com.example.demo.dtos.request.CreatePersonRequest;
import com.example.demo.dtos.response.CreatePersonResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertNotNull;
@SpringBootTest
@ContextConfiguration(classes = DemoApplication.class)
public class PerssonTest {
//    private PersonServices personServices;
//    private CreatePersonRequest createPersonRequest;
//    @Autowired
//    private PersonRepository personRepository;
//    @Autowired
//    private AddressService addressService;
//   @BeforeEach void startsWith(){
//       personServices = new PersonServicesImpl(personRepository, addressService);
//       Address address = Address.builder()
//               .state("Lagos")
//               .houseNumber("20")
//               .streetName("kajola")
//               .build();
//       createPersonRequest = CreatePersonRequest.builder()
//               .email("leumasre@gmail.com")
//               .lastName("last_name")
//               .firstName("first_name")
//               .sex(Sex.MALE).build();
//   }
//   @Test public void createPerson_NumberOfCreatedPerson_IsOneTest(){
//      CreatePersonResponse response = personServices.createPerson(createPersonRequest);
//      assertNotNull(response);
////      personServices.getPersonByMail("  ");
//   }
}
