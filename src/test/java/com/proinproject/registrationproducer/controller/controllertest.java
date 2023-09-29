package com.proinproject.registrationproducer.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;

import com.proinproject.registrationproducer.model.Person;

@SpringBootTest
public class controllertest {

	@InjectMocks
	private homeController contr;
	
	@Mock
	private KafkaTemplate<String,Person> temp;
	
	@Test
	public void kkk() {
		Person wfe=new Person();
		ResponseEntity<String> ddd=contr.sendmess(wfe);
		assertEquals(ddd.getStatusCode(), HttpStatus.CREATED);
	}
}
