package com.proinproject.registrationproducer.configs;

import java.util.HashMap;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.proinproject.registrationproducer.Constants.AppConatsnta;
import com.proinproject.registrationproducer.model.Person;

@Configuration
public class ProduConfig {
	
	@Bean
	public ProducerFactory<String,Person> setConfig(){
		
		HashMap<String,Object> ed=new HashMap();
		ed.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConatsnta.host);
		ed.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,StringSerializer.class);
		ed.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,JsonSerializer.class);
		return new DefaultKafkaProducerFactory<>(ed);
	}
	
	@Bean
	public KafkaTemplate<String,Person> ss(){
		return new KafkaTemplate<String,Person>(setConfig());
	}

}
