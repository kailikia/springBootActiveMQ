package com.techcamp.sms.smsEntry.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techcamp.sms.smsEntry.JmsConfig.SmsEntryJmsConfig;
import com.techcamp.sms.smsEntry.Models.SmsModel;

@Component
@RestController
@RequestMapping("/sms")
public class SmsEntryController {
	
@Autowired
private JmsTemplate jmsTemplate;
	
@PostMapping("/send")
public SmsModel sender(SmsModel sms)
{	
//		try {
		
		jmsTemplate.convertAndSend(SmsEntryJmsConfig.jmsConfig,sms);		 
		return sms;	
		
//	     } catch (Exception e) {
		 // TODO: handle exception
//	    	 return sms;
//	     }
			
}
	
}
