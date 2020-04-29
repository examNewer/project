package com.study.student.service;

import com.study.api.domain.StuUser;

public interface StuUserService {
	public StuUser login(String userName,String pwd);
}
