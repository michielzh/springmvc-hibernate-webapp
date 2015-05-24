package cn.ac.iie.dao;


import cn.ac.iie.model.TUser;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
// defaultRollback=true不会改变数据库，false会改变数据库
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class UserDaoTest {

	@Resource
	private IUserDao userDao;

	@Test
	public void testIsExist() {
		TUser user = new TUser();
		user.setUname("123");
		user.setUpassword("123");
		boolean result = userDao.isExist(user);
		System.out.println(result);
	}

}
