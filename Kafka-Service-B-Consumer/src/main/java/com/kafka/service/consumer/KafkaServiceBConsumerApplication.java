package com.kafka.service.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaServiceBConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaServiceBConsumerApplication.class, args);

		System.out.println("Consumer Service B");

	}

}
