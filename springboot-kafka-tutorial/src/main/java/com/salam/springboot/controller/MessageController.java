package com.salam.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.salam.springboot.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

	
	private KafkaProducer kafkaProducer;

	public MessageController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}
	
	/**
	 * This method consume json from kafka server
	 * URL: http://localhost:8080/api/v1/kafka/publish
	 * @param message
	 * @return
	 * json format
	 * {
	    "id": 1,
	    "firstName": "Saqeeb",
	    "lastName": "Zaira"
		}
	 */
	//http://localhost:8080/api/v1/kafka/publish
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message)
	{
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("Message sent to the topic");
	}
	
	
}
