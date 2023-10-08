package com.vinod.ioc;

import org.springframework.stereotype.Component;

@Component
public class FirebaseNotificationService implements NotificationService{

	public void sendNotification() {
		System.out.println("Firebase Notificaiton message sent");
	}
}
