package org.androidpn.server.dao.hibernate;

import java.util.List;

import org.androidpn.server.dao.NotificationDao;
import org.androidpn.server.model.Notification;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class NotificationDaoHibernate extends HibernateDaoSupport implements NotificationDao{

	public void saveNotification(Notification notification) {
		getHibernateTemplate().saveOrUpdate(notification);
		getHibernateTemplate().flush();
	}

	@SuppressWarnings("unchecked")
	public List<Notification> findNotificationByUsername(String username) {
		return getHibernateTemplate()
				.find("from Notification n where n.username = ? ",username);
	}

	public void deleteNotification(Notification notification) {
		getHibernateTemplate().delete(notification);
	}

	@SuppressWarnings("unchecked")
	public void deleteNotificationByUUID(String uuid) {
		List<Notification> list = getHibernateTemplate().find("from User where uudi = ?",uuid);
		if(list != null && list.size() > 0){
			deleteNotification(list.get(0));
		}
	}
}
