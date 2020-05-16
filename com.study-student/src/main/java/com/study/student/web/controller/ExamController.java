/**
 * 
 */
package com.study.student.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.api.domain.Exam;
import com.study.student.service.ExamService;

/**
 * @author 黄达
 *
 * 2020年5月7日
 */
@RestController
public class ExamController {
	@Autowired
	private ExamService examService;
	
	@RequestMapping("findExamById")
	public Exam findExamById(String examCode) {
		return this.examService.findExamById(examCode);
	}
}
