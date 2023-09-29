package com.proinproject.registrationproducer.constant6s;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.proinproject.registrationproducer.Constants.AppConatsnta;

@SpringBootTest
public class AppConstantsTest {
	
	@InjectMocks
	private AppConatsnta ddsa;

	@Test
	public void jkjkds() {
		assertEquals(ddsa.host,"localhost:9092");
		assertEquals(ddsa.topic,"person-data");
	}
}
