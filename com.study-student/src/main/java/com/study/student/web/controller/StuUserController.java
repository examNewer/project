package com.study.student.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.api.domain.StuUser;
import com.study.student.service.StuUserService;

@RestController
public class StuUserController {
	@Autowired
	private StuUserService stuUserService;
	
	@RequestMapping("login")
	public StuUser login(String userName,String pwd) {
		System.out.println(userName);
		System.out.println(pwd);
		StuUser stuUser=this.stuUserService.login(userName, pwd);
		return stuUser;
	}

}
