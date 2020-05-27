package com.newer.exam;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;


@MapperScan(basePackages = "com.newer.exam.mapper")
@SpringBootApplication(scanBasePackages = "com.newer.exam")
public class ExamTeacherApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamTeacherApplication.class, args);
	}

}
