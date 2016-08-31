package com.ssh.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.entity.UserInfo;
import com.ssh.mdservice.ModelService;

public class Unit1 {

	private static ApplicationContext app;

	@BeforeClass
	public static void before() {

		app = new ClassPathXmlApplicationContext("app1.xml");
	}

	@Test
	public void test1() {

		ModelService service = (ModelService) app.getBean("modelservice");
		System.out.println(service.login(new UserInfo("tom","666",null)));
	}
}
