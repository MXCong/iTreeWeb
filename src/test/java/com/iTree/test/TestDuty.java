package com.iTree.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iTree.pageModel.DutyPage;
import com.iTree.service.DutyServiceI;
import com.iTree.service.UserServiceI;

public class TestDuty {

	@Test
	public void testSave() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring.xml",
						"classpath:spring-hibernate.xml" });
		DutyServiceI ser = (DutyServiceI) ac.getBean("dutyService");
		DutyPage dutyPage = new DutyPage();
		dutyPage.setName("老师");
		dutyPage.setStatus(3);
		ser.save(dutyPage);
	}

}
