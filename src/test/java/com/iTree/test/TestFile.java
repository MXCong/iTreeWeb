package com.iTree.test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iTree.pageModel.FilePage;
import com.iTree.service.FileServiceI;

public class TestFile {

	@Test
	public void testSave() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring.xml",
						"classpath:spring-hibernate.xml" });
		FileServiceI ser = (FileServiceI) ac.getBean("fileService");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		FilePage filePage = new FilePage();
		filePage.setTitle("test");
		filePage.setUploadTime(new Timestamp(new Date().getTime()));
		ser.save(filePage);
	}

}
