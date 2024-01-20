package com.salam.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * This class is used to create produce to send message 
 * @author Saqeeb Alam
 *
 */
@Service
public class KafkaProducer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
	
	private KafkaTemplate<String, String> kafkaTemplete;
	
	//Below constructor is use for constructor dependency injection for KafkaTemplate
	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplete) {
		this.kafkaTemplete = kafkaTemplete;
	}
	
	/**
	 * Send message to broker 
	 * topic 'javaguides' 
	 * @param message
	 */
	
	public void sendMessage(String message)	
	{
		LOGGER.info(String.format("Message sent %s", message));
		kafkaTemplete.send("javaguides",message);
	}
	
	
	
}
