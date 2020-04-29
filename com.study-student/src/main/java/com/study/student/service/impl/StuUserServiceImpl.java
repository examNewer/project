package com.study.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.api.domain.StuUser;
import com.study.student.dao.StuUserMapper;
import com.study.student.service.StuUserService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service
public class StuUserServiceImpl implements StuUserService{
	@Autowired
	private StuUserMapper userMapper;

	@Override
	public StuUser login(String userName, String pwd) {
		// TODO Auto-generated method stub
		Example example=new Example(StuUser.class);
		Criteria criteria=example.createCriteria();
		criteria.andEqualTo("userName",userName);
		criteria.andEqualTo("pwd",pwd);
		return userMapper.selectOneByExample(example);
	}

}
