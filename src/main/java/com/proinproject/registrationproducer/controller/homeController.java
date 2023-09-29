package com.proinproject.registrationproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proinproject.registrationproducer.Constants.AppConatsnta;
import com.proinproject.registrationproducer.model.Person;

@RestController
@CrossOrigin("*")
public class homeController {
	
	@Autowired
	private KafkaTemplate<String,Person> temp;

	@PostMapping("/add")
	public ResponseEntity<String> sendmess(@RequestBody Person pers){
		temp.send(AppConatsnta.topic,pers);
		return ResponseEntity.status(HttpStatus.CREATED).body("Done &Dusted");
		
	}
}
