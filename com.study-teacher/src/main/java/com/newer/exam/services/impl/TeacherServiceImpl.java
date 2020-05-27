package com.newer.exam.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.exam.domain.Teacher;
import com.newer.exam.mapper.TeacherMapper;
import com.newer.exam.services.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherMapper teacherMapper;
	
	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Teacher record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertByFilter(Teacher record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Teacher selectById(Integer id) {
		// TODO Auto-generated method stub
		return teacherMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByIdFilter(Teacher record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateById(Teacher record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Teacher getTeacherByUsernamePwd(String userName, String pwd) {
		// TODO Auto-generated method stub
		return teacherMapper.getTeacherByUserNamePwd(userName, pwd);
	}

}
