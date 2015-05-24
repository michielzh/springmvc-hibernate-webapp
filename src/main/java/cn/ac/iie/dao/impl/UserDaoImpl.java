package cn.ac.iie.dao.impl;

import cn.ac.iie.dao.IUserDao;
import cn.ac.iie.model.TUser;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements IUserDao {

	@Resource
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean isExist(TUser user) {
		Session session = this.getSession();
		String hql = "from TUser where uname =? and upassword = ?";
		Query query = session.createQuery(hql);
		query.setString(0, user.getUname());
		query.setString(1, user.getUpassword());
		if (query.list().size() >= 1) {
			return true;
		}
		return false;
	}
}
