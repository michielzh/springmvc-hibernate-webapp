package cn.ac.iie.service;

import cn.ac.iie.model.TUser;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

	@Resource
	private IUserService userService;

	@Test
	public void testIsExist() {
		TUser user = new TUser();
		user.setUname("phn");
		user.setUpassword("123456");
		boolean result = userService.isExist(user);
		System.out.println(result);
	}

}
