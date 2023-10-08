package com.vinod.ioc;

/**
 * Email Service to send email message
 */
public class EmailService implements MessageService {

	public EmailService() {
		System.out.println("Email Service constructor");
	}
	
	/**
	 * Sending email using third party library 
	 * 
	 * @param message_to
	 * @param message
	 */
	public void sendMessage(String message_to, String message) {
		
		System.out.println("Going to send email message to:"+ message_to);
		
		System.out.println("Email message sent");
	}
}
