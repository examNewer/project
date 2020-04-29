package com.study.student.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.api.domain.StuUser;
import com.study.student.service.StuUserService;

@RestController
public class StuUserController {
	private StuUserService stuUserService;
	
	@RequestMapping("login")
	public StuUser login(String userName,String pwd) {
		StuUser stuUser=this.stuUserService.login(userName, pwd);
		return stuUser;
	}

}
