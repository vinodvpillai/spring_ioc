package com.vinod.ioc;

/**
 * SMS Service to send SMS message
 */
public class SMSService implements MessageService{
	
	public SMSService() {
		System.out.println("SMS Service constructor");
	}
	/**
	 * Sending SMS message using third party library 
	 * 
	 * @param message_to
	 * @param message
	 */
	public void sendMessage(String message_to, String message) {
		
		System.out.println("Going to send sms message to:"+ message_to);
		
		System.out.println("SMS message sent");
	}
}
