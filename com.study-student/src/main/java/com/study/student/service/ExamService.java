/**
 * 
 */
package com.study.student.service;

import com.study.api.domain.Exam;

/**
 * @author 黄达
 *
 * 2020年5月7日
 */
public interface ExamService {
	/**
	 * 根据考场号查询考试信息
	 * @param examCode
	 * @return
	 */
	public Exam findExamById(String examCode);
}
