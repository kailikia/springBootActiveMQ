package com.techcamp.sms.smsEntry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SmsEntryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsEntryApplication.class, args);
	}
}
