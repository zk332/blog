package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication//开启自动配置
@Controller
public class Application {
	//项目启动入口，可以由mvn spring-boot:run或直接启动该main函数启动项目
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
