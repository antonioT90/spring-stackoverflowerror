package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@EmbeddedKafka(topics = {
		"${spring.cloud.stream.bindings.consumerDemo-in-0.destination}"
})
@TestPropertySource(
		properties = {
				"logging.level.org.apache.zookeeper=WARN",
				"logging.level.org.apache.kafka=WARN",
				"logging.level.kafka=WARN",
				"logging.level.state.change.logger=WARN",
				"spring.cloud.stream.kafka.binder.configuration.security.protocol=PLAINTEXT",
				"spring.kafka.bootstrap-servers=${spring.embedded.kafka.brokers}",
				"spring.cloud.stream.binders.kafka-consumer.environment.spring.cloud.stream.kafka.binder.brokers=${spring.embedded.kafka.brokers}",
		})
class SpringStackoverflowerrorApplicationTests {

	@Test
	void contextLoads() {
	}

}
