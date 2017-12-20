package edu.mum.farmer.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@JmsListener(destination = "bank.queue")
	public void receiveQueue(String message) {
		System.out.println("msg receiving from bank.queue..."+" \nmsg:"+message);
	}

}