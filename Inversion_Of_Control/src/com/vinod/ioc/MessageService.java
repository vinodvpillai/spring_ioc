package com.vinod.ioc;

/**
 * Message Service - Email, SMS
 */
public interface MessageService {
	
	/**
	 * Send Message method
	 * 
	 * @param message_to
	 * @param message
	 */
	public void sendMessage(String message_to, String message);
}
