package com.epam.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Java program to implement the
//controller for the spring
//application

@RestController
@RequestMapping("/kafka")
public class MyController {

	@Autowired
	KafkaTemplate<String, String>
		kafkaTemplate;

	static final String TOPIC = "mypost";

	// Implementing a GET method
	@GetMapping("publish/{message}")
	public String publish_message(
		@PathVariable("message") String message)
	{
		kafkaTemplate.send(TOPIC, message);
		return "Message Published on Kafka -> " + message;
	}
}
