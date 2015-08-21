package com.iTree.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iTree.pageModel.User;
import com.iTree.service.UserServiceI;

public class testUser {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring.xml",
						"classpath:spring-hibernate.xml" });
		UserServiceI userservice = (UserServiceI) ac.getBean("userService");
		User u =new User();
//		u.setId("132");
//		u.setUsername("guanjiwei");
		u.setName("guanjiwei123");
		u.setPwd("123");
//		u.setPassword("123");
		userservice.save(u);
	}

}
