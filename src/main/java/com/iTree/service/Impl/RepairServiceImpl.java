package com.iTree.service.Impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iTree.dao.TmenuDaoI;
import com.iTree.dao.UserDaoI;
import com.iTree.model.Tmenu;
import com.iTree.model.Users;
import com.iTree.service.RepairServiceI;
import com.iTree.util.Encrypt;

@Service("repairService")
public class RepairServiceImpl implements RepairServiceI {
	private UserDaoI userDao;
	private TmenuDaoI tmenuDao;

	public UserDaoI getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(UserDaoI userDao) {
		this.userDao = userDao;
	}

	public TmenuDaoI getTmenuDao() {
		return tmenuDao;
	}

	@Autowired
	public void setTmenuDao(TmenuDaoI tmenuDao) {
		this.tmenuDao = tmenuDao;
	}

	@Override
	public void repair() {
		repairTmenu();
		repairUser();
	}

	public void repairTmenu() {
		Tmenu menu = new Tmenu();
		menu.setId("root");
		menu.setText("首页");
		tmenuDao.saveOrUpdata(menu);
		
		Tmenu xtgl = new Tmenu();
		xtgl.setTmenu(menu);
		xtgl.setId("xtgl");
		xtgl.setText("系统管理");
		tmenuDao.saveOrUpdata(xtgl);
		
		Tmenu yhgl = new Tmenu();
		yhgl.setTmenu(xtgl);
		yhgl.setId("yhgl");
		yhgl.setText("用户管理");
		tmenuDao.saveOrUpdata(yhgl);
		
		Tmenu jsgl = new Tmenu();
		jsgl.setTmenu(xtgl);
		jsgl.setId("jsgl");
		jsgl.setText("角色管理");
		tmenuDao.saveOrUpdata(jsgl);
		
		Tmenu qxgl = new Tmenu();
		qxgl.setTmenu(xtgl);
		qxgl.setId("qxgl");
		qxgl.setText("权限管理");
		tmenuDao.saveOrUpdata(menu);
		
		Tmenu cdgl = new Tmenu();
		cdgl.setTmenu(xtgl);
		cdgl.setId("cdgl");
		cdgl.setText("菜单管理");
		tmenuDao.saveOrUpdata(cdgl);
		
		Tmenu buggl = new Tmenu();
		buggl.setTmenu(xtgl);
		buggl.setId("buggl");
		buggl.setText("BUG管理");
		tmenuDao.saveOrUpdata(buggl);

	}

	public void repairUser() {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", "admin");
		Users users = userDao.login(
				"from Users u where u.name=:name and u.id!='0'", params);
		if (users!=null) {
			users.setName(UUID.randomUUID().toString());
		}
		Users user = new Users();
		user.setId("0");
		user.setName("admin");
		user.setPwd(Encrypt.e("admin"));
		user.setSetdate(new Date());
		userDao.saveOrUpdata(user);
		
		
	}

}
