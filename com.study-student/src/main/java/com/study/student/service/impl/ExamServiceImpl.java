/**
 * 
 */
package com.study.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.api.domain.Exam;
import com.study.student.dao.ExamMapper;
import com.study.student.service.ExamService;

/**
 * @author 黄达
 *
 * 2020年5月7日
 */
@Service
public class ExamServiceImpl implements ExamService{
	@Autowired
	private ExamMapper examMapper;

	@Override
	public Exam findExamById(String examCode) {
		// TODO Auto-generated method stub
		return this.examMapper.findExamById(examCode);
	}

}
