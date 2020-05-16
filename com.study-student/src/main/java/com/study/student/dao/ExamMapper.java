/**
 * 
 */
package com.study.student.dao;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.study.api.domain.Exam;

import tk.mybatis.mapper.common.Mapper;

/**
 * @author 黄达
 *
 * 2020年5月5日
 */
public interface ExamMapper extends Mapper<Exam>{
	@Results( value = {
			@Result(column = "eid",property = "eid",id = true),
			@Result(column = "begin_time",property = "beginTime"),
			@Result(column = "end_time",property = "endTime"),
			@Result(column = "exam_code",property = "examCode"),
			@Result(column = "create_time",property = "createTime"),
			@Result(column = "eid",property = "testPaper",
			many=@Many(select="com.study.student.dao.TestPaperMapper.findTestPaperByEid"))})		
	@Select("select * from Exam where exam_code=#{examCode}")
	public Exam findExamById(String examCode);
}
