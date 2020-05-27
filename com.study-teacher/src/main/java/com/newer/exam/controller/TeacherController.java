package com.newer.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.newer.exam.base.RestResponse;
import com.newer.exam.domain.Teacher;
import com.newer.exam.domain.User;
import com.newer.exam.services.TeacherService;
import com.newer.exam.services.impl.TeacherServiceImpl;

@RestController("TeahcerController")
@RequestMapping(value = "/api/admin")
@Controller
public class TeacherController  {
	
	@Autowired
	private TeacherService teacherService;
	
	
	@RequestMapping("/login")
	public RestResponse<Teacher> login(@RequestBody User user) {
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		Teacher teacher = this.teacherService.getTeacherByUsernamePwd(user.getUserName(), user.getPassword());
		return RestResponse.ok(teacher);
	}
	
	@RequestMapping(value = "/select/{id}", method = RequestMethod.POST)
	public RestResponse<Teacher> current(@PathVariable int id){
		Teacher teacher = teacherService.selectById(id);
		return RestResponse.ok(teacher);
	}
	
}
