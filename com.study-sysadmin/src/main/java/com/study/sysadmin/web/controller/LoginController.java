package com.study.sysadmin.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.sysadmin.domain.Administrator;
import com.study.sysadmin.service.AdministratorService;

@RestController
@RequestMapping("login")
@CrossOrigin
public class LoginController {
	@Autowired
	private AdministratorService service;
	
	
	@RequestMapping("login")
	public Administrator login(String adminAccount,String adminPwd,Model model,HttpSession session) {
		Administrator admin=this.service.login(adminAccount, adminPwd);
		return admin;
	}
}
