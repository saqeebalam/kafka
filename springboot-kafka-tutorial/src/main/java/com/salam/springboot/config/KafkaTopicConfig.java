package com.salam.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * This Class is responsible to create Topics on kafka.
 * @author Saqeeb Alam
 *
 */
@Configuration
public class KafkaTopicConfig {
	
	/**
	 * This method is responsible  to build kafka topics
	 * Topic name created 'javaguides'
	 * For partitions use partitions(partitionCount)
	 * @return
	 */
	@Bean
	public NewTopic javaguidetopic() {
		return TopicBuilder.name("javaguides").build();
	}

	
		@Bean
		public NewTopic javaguidejsontopic() {
			return TopicBuilder.name("javaguides_json").build();
		}
}
