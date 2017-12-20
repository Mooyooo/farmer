package edu.mum.farmer;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FarmerApplication extends SpringBootServletInitializer {

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("bank.queue");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FarmerApplication.class, args);
	}
}
