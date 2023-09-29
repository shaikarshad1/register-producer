package com.proinproject.registrationproducer.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.proinproject.registrationproducer.model.Person;

@SpringBootTest
public class modeltest {

	@Test
	public void sasa() {
		Person sd=new Person("ethanhunt","Ethan","Hunt","Admin","ethanhunt@mi9.com","password");
		sd.setEmail("ethanhunt@mi9.com");
		sd.setFirstName("Ethan");
		sd.setLastName("Hunt");
		sd.setUserName("ethanhunt");
		sd.setRole("Admin");
		sd.setPassword("password");
		
		assertEquals(sd.getUserName(),"ethanhunt");
		assertEquals(sd.getFirstName(),"Ethan");
		assertEquals(sd.getLastName(),"Hunt");
		assertEquals(sd.getRole(),"Admin");
		assertEquals(sd.getEmail(),"ethanhunt@mi9.com");
		assertEquals(sd.getPassword(),"password");
		
	}
}
