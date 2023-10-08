package com.vinod.ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SNSNotificationService implements NotificationService{

	public void sendNotification() {
		System.out.println("SNS Notificaiton message sent");
	}
}
