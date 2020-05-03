/**
 * 
 */
package com.study.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.api.domain.Classify;
import com.study.student.dao.ClassifyMapper;
import com.study.student.service.ClassifyService;

/**
 * @author 黄达
 *
 * 2020年5月2日
 */
@Service
public class ClassifyServiceImpl implements ClassifyService{
	@Autowired
	private ClassifyMapper classifyMapper;

	@Override
	public List<Classify> findClassifies() {
		// TODO Auto-generated method stub
		return this.classifyMapper.selectAll();
	}
	
	

}
