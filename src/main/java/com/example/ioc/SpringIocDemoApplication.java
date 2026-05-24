package com.example.ioc;

import com.example.ioc.controller.UserController;
// 正确的 Spring 容器包
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIocDemoApplication {

	public static void main(String[] args) {
		// 1. 获取 Spring 容器（不用强转）
		ApplicationContext context = SpringApplication.run(SpringIocDemoApplication.class, args);

		// 2. 从容器中获取 Bean
//		UserController userController = context.getBean(UserController.class);
//		// 3. 打印验证（能打印出对象地址，说明 IOC 生效）
//		System.out.println("从 Spring 容器中获取的 Bean：" + userController);
//
//		UserController userController1 = (UserController) context.getBean("userController");
//		System.out.println(userController1);
//
//		UserController userController2 = context.getBean("userController" , UserController.class);
//		System.out.println(userController2);


	}

}