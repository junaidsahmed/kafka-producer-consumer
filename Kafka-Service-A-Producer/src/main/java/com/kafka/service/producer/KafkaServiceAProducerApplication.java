package com.kafka.service.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class KafkaServiceAProducerApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaServiceAProducerApplication.class, args);

		log.warn("Running service A Producer");
	}

}
