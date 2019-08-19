package com.cog.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cog.kafka.model.Greetings;
import com.cog.kafka.producer.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	@Autowired
	private KafkaProducer kafkaProducer;

	@GetMapping("/demo")
	public String demo() {
		Greetings greeting = new Greetings("Kafka working fine!","Gurusharan Gupta");
		kafkaProducer.sendMessage(greeting);
		return "hello there";

	}

}
