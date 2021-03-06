package org.androidpn.server.service;

import java.util.List;

import org.androidpn.server.model.Notification;

public interface NotificationService {
	public void saveNotification(Notification notification);

	public List<Notification> findNotificationByUsername(String username);

	public void deleteNotification(Notification notification);
	
	public void deleteNotificationByUUID(String uuid);
}
