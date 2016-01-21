package org.androidpn.server.dao;

import java.util.List;

import org.androidpn.server.model.Notification;

public interface NotificationDao {
	public void saveNotification(Notification notification);

	public List<Notification> listNotificationByUsername(String username);

	public void deleteNotification(Notification notification);
	public void deleteNotificationByUUID(String uuid);
}
