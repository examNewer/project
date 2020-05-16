/**
 * 
 */
package com.study.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.study.api.domain.TestPaper;

import tk.mybatis.mapper.common.Mapper;

/**
 * @author 黄达
 *
 * 2020年5月7日
 */
public interface TestPaperMapper extends Mapper<TestPaper>{
	@Results({
		@Result(column = "id",property = "id",id = true)
	})
	@Select("SELECT * from Test_Paper where eid=#{eid}")
	public List<TestPaper> findTestPaperByEid(Integer eid);
}
