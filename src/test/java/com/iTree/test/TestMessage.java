package com.iTree.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iTree.pageModel.MessagePage;
import com.iTree.service.MessageServiceI;

public class TestMessage {

	@Test
	public void testSave() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring.xml",
						"classpath:spring-hibernate.xml" });
		MessageServiceI ser = (MessageServiceI) ac.getBean("messageService");
		MessagePage messagePage = new MessagePage();
		messagePage.setName("test");
		messagePage.setStatus(1);
		ser.save(messagePage);
	}

}
