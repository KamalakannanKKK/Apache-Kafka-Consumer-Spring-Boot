package com.apache.kafka_consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class kafkalistener {

	@KafkaListener(topics = "helloTopic",groupId = "Consumer-Group")
	public void consume(String message) {
		System.out.println("Consumed Message: "+message);
	}
}
