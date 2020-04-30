package com.study.student;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.study.student.dao")
@SpringBootApplication
public class studentApplication {

	public static void main(String[] args) {
		SpringApplication.run(studentApplication.class, args);
	}

}