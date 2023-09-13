package com.example.demo;

import com.example.demo.data.models.Person;
import com.example.demo.data.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	PersonRepository personRepository;

	@Test
	void contextLoads() {
	}
	@Test
	public void personCan_Be_CreatedTest(){
		Person person = new Person();
		Person savedPerson = personRepository.save(person);
		assertNotNull(savedPerson);
	}
}
