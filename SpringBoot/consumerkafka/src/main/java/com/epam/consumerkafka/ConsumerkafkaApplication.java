package com.epam.consumerkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ConsumerkafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerkafkaApplication.class, args);
	}

}
