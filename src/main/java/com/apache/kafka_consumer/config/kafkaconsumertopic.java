package com.apache.kafka_consumer.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

@Configuration
@EnableKafka
public class kafkaconsumertopic {

	
	@Bean
	public ConsumerFactory<String, String> consumerFactory(){
		
		Map<String, Object> ConsumerProps=new HashMap<String,Object>();
		ConsumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
		ConsumerProps.put(ConsumerConfig.GROUP_ID_CONFIG,"Consumer-Group");
		ConsumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
		ConsumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
		
		return new DefaultKafkaConsumerFactory<String, String>(ConsumerProps);
	}
}
