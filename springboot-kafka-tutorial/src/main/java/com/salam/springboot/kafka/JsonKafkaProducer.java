package com.salam.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.salam.springboot.payload.User;

@Service
public class JsonKafkaProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);
	
	private KafkaTemplate<String, User> kafkaTemplete;

	public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplete) {
		this.kafkaTemplete = kafkaTemplete;
	}
	
	
	public void sendMessageJson(User data)
	{
		LOGGER.info(String.format("Json Message sent -> %s", data.toString()));
		Message<User> message=MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC, "javaguides_json").build();
		kafkaTemplete.send(message);
	}

	
}
