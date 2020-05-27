package com.newer.exam.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.exam.domain.ExercisesClassify;
import com.newer.exam.mapper.ExercisesClassifyMapper;
import com.newer.exam.mapper.ExercisesMapper;
import com.newer.exam.services.ExercisesClassifyService;

@Service
public class ExercisesClassifyServiceImpl implements ExercisesClassifyService {
	
	@Autowired
	private ExercisesClassifyMapper exercisesClassifyMapper;

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(ExercisesClassify record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertByFilter(ExercisesClassify record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ExercisesClassify selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByIdFilter(ExercisesClassify record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateById(ExercisesClassify record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ExercisesClassify> selectAll() {
		// TODO Auto-generated method stub
		return exercisesClassifyMapper.selectAll();
	}

}
