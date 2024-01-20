package com.salam.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salam.springboot.kafka.JsonKafkaProducer;
import com.salam.springboot.payload.User;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

	
	private JsonKafkaProducer jsonKafkaProducer;

	public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
		this.jsonKafkaProducer = jsonKafkaProducer;
	}
	
   //http://localhost:8080/api/v1/kafka/publish
	@PostMapping("/publish")
	public ResponseEntity<String> publishJson(@RequestBody User user)
	{
		jsonKafkaProducer.sendMessageJson(user);		
		return  ResponseEntity.ok("Json message sent to kafka topic");
	}
	
}
