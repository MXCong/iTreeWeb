package com.iTree.service.Impl;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iTree.dao.BaseDaoI;
import com.iTree.dao.UserDaoI;
import com.iTree.model.Users;
import com.iTree.pageModel.User;
import com.iTree.service.UserServiceI;
import com.iTree.util.Encrypt;
/**
 * 逻辑数据处理层
 * @author guanjiwei
 *
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(UserServiceImpl.class);
	
//	private TstudentDaoI tstudentDao;
	
	private UserDaoI userDao;	
	
	

	/*public TstudentDaoI getTstudentDao() {
		return tstudentDao;
	}
	
	@Autowired
	public void setTstudentDao(TstudentDaoI tstudentDao) {
		this.tstudentDao = tstudentDao;
	}
*/
	public UserDaoI getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(UserDaoI userDao) {
		this.userDao = userDao;
	}

	@Override
	public Serializable save(User user) {
		// user.setUsername(name);
		// user.setPassword(password);
		Users tuser = new Users();
		BeanUtils.copyProperties(user, tuser, new String[] { "pwd" });
		tuser.setId(UUID.randomUUID().toString());
		tuser.setSetdate(new Date());
		tuser.setPwd(Encrypt.e(user.getPwd()));
		userDao.save(tuser);

		return null;
	}
	
	
	@Override
	public User login(User user) {
		// String hql =
		// "from Users u where u.name='"+user.getName()+"' and u.pwd='"+Encrypt.e(user.getPwd())+"'";
		String hql = "from Users u where u.name = :name and u.pwd = :pwd";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", user.getName());
		params.put("pwd", Encrypt.e(user.getPwd()));
		Users U = userDao.login(hql, params);
		if (U != null) {
			return user;
		}
		return null;
	}

}
