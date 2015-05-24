package cn.ac.iie.service.impl;

import cn.ac.iie.dao.IUserDao;
import cn.ac.iie.model.TUser;
import cn.ac.iie.service.IUserService;
import javax.annotation.Resource;
 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
 
	@Override
	public boolean isExist(TUser user) {
		return userDao.isExist(user);
	}
 
}

