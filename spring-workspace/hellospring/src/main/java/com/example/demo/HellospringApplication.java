package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HellospringApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(HellospringApplication.class, args);
		Hello obj = context.getBean(Hello.class);
		obj.sayHello();
	}

}
