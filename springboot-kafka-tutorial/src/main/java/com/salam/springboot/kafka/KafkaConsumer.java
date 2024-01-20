package com.salam.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * This class is responsible for creating consumer for kafka message
 * 
 * @author Saqeeb Alam
 *
 */

@Service
public class KafkaConsumer {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
	
	/**
	 * This method is for topic 'javaguides' for listening message. and for groupId = "myGroup"
	 * @param message
	 */
	@KafkaListener(topics = "javaguides",groupId = "myGroup")
	public void consumer(String message)
	{
		LOGGER.info(String.format("Message recived %s", message));
	}
}
