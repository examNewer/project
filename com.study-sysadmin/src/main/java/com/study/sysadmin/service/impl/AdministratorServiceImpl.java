package com.study.sysadmin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.sysadmin.dao.AdminnistratorDao;
import com.study.sysadmin.domain.Administrator;
import com.study.sysadmin.service.AdministratorService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class AdministratorServiceImpl implements AdministratorService {
	
	@Autowired
	private AdminnistratorDao dao;

	@Override
	
	public Administrator login(String adminAccount, String adminPwd) {
		
		Example example = new Example(Administrator.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("adminAccount", adminAccount);
		criteria.andEqualTo("adminPwd", adminPwd);
		return dao.selectOneByExample(example);
	}

}
