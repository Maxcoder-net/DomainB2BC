package service;

import org.apache.kafka.clients.producer.Producer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;


import java.util.HashMap;
import java.util.Map;


@Configuration
public class Customerservice {

	@Bean
	public Producer<String, String> producerFactory() {
		Map<String, Object>  configprop = new HashMap<>();
		
		return new DefaultKafkaProducerFactory<>(configprop);
		
		
		
	
}
	
