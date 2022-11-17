package com.epam.consumerkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

	// Annotation required to listen the
	// message from kafka server
	@KafkaListener(topics = "mypost",
				groupId = "id")
	public void
	publish(String message)
	{
		System.out.println(
			"You have a new message: "
			+ message);
	}
}
