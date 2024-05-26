package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HelloSpringApplication.class, args);
		Hello obj = context.getBean(Hello.class);
		obj.sayHello();
	}

}
