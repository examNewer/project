/**
 * 
 */
package com.study.student.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.study.api.domain.Section;

import tk.mybatis.mapper.common.Mapper;

/**
 * @author 黄达
 *
 * 2020年5月3日
 */
public interface SectionMapper extends Mapper<Section>{
	@Results({
		@Result(column = "sid",property = "sId",id = true),
		@Result(column = "sname",property = "sName"),
	})
	@Select("SELECT * from Section where cid=#{cid}")
	public ArrayList<Section> findSectionsByCid(Integer cid);
}
