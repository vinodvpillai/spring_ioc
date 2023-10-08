package com.vinod.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main Program
 */
public class MainProg {

	public static void main(String[] args) {

//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		//Calling the SMS Service
//		MessageService messageService = context.getBean("messageService",MessageService.class);
//		messageService.sendMessage("+91-1234567891", "Welcome to Spring framework session");

		ApplicationContext context = new AnnotationConfigApplicationContext(com.vinod.ioc.config.AppConfig.class);

		System.out.println("=========");
		
		MessageService emailService = context.getBean("annotationEmailService", MessageService.class);
		emailService.sendMessage("abc@gmail.com", "Welcome to Spring framework session");
		
		System.out.println("=========");
		
		MessageService smsService = context.getBean("annotationSMSService", MessageService.class);
		smsService.sendMessage("+91-1234567891", "Welcome to Spring framework session");
	
		System.out.println("=========");
		
		NotificationService notificationService = context.getBean(NotificationService.class);
		notificationService.sendNotification();
		
		System.out.println("=========");
	}
}
