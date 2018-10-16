package com.techcamp.sms.smsEntry.Models;


public class SmsModel {

	public int phone;
	public String body;
	
	public SmsModel() {
		
	}
		
	public SmsModel(int phone, String body) {
		this.phone = phone;
		this.body = body;
	}

	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
		return "SmsModel [body=" + getBody() + "]";
	}
	
	
}
