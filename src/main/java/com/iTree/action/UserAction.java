package com.iTree.action;


import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.beans.factory.annotation.Autowired;

import com.iTree.pageModel.Json;
import com.iTree.pageModel.User;
import com.iTree.service.UserServiceI;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 获取父包 包空间 对应的类级别struts映射命名
 * 逻辑转换层
 * @author guanjiwei
 * 
 */
@Namespace("/")
@Action("userAction")
public class UserAction extends BaseAction implements ModelDriven<User> {
	// 自动获得表单提交的数据，
	User user = new User();

	// 自动将提交的数据写入到user中，得力于ModelDriven
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	private static final Logger logger = Logger.getLogger(UserAction.class);

	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	// 使用那个自动注入
	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	public void addUser() {
		Json j = new Json();
		try {
			userService.save(user);
			logger.info(user.getName() + "插入成功");
			j.setSuccess(true);
			j.setMsg("插入成功");
		} catch (Exception e) {
			logger.info(user.getName() + "插入失败");
			j.setMsg(e.getMessage());
		}
		super.writeJson(j);

	}

	public void login() {
		Json j = new Json();
		User u = userService.login(user);
		if (u != null) {
			j.setSuccess(true);
			j.setMsg("登录成功");
		} else {
			j.setMsg("登录失败");
		}
		super.writeJson(j);
	}
	
	/*public void addStudent(){
		TStudent student = new TStudent();
		student.setName("管纪伟");
		student.setPassword("123");
		try{
			userService.saveTStudent(student);
			System.out.println("插入学生数据成功");
		}catch(Exception e){
			System.out.println("插入学生数据失败");
		}
		
		
	}*/

}
