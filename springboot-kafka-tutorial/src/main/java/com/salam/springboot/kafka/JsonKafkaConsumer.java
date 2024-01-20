package com.salam.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.salam.springboot.entity.UserData;
import com.salam.springboot.payload.User;
import com.salam.springboot.repository.UserDetailsRepository;

@Service
public class JsonKafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

	private UserDetailsRepository userDetailsRepository;
	
	
	
	
	public JsonKafkaConsumer(UserDetailsRepository userDetailsRepository) {
		this.userDetailsRepository = userDetailsRepository;
	}




	@KafkaListener(topics = "javaguides_json", groupId = "myGroup")
	public void consume(User user)
	{
		LOGGER.info(String.format("Json Message recived %s", user.toString()));
		
		/*
		 * UserData userData = new UserData();
		 * userData.setIdentificationNo(user.getIdentificationNo());
		 * userData.setFirstName(user.getFirstName());
		 * userData.setLastName(user.getLastName());
		 * 
		 * userDetailsRepository.save(userData);
		 */
	}
}
