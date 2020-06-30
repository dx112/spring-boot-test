package com.atguigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@MapperScan(value = "com.atguigu.springboot.mapper")
@SpringBootApplication
public class SpringBoot04WebRestfulcrudDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot04WebRestfulcrudDemo2Application.class, args);
	}

}
