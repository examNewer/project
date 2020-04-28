package com.study.sysadmin.service;

import com.github.pagehelper.PageInfo;
import com.study.api.domain.Classify;
import com.study.api.dto.MsgDto;
import com.study.api.dto.PageDto;

public interface ClassifyService {
	/**
	 * 查询所有类型
	 * @return
	 */
	public PageInfo<Classify> findClassifyAll(PageDto dto);
	
	/**
	 * 修改
	 * @param classIfy
	 * @return
	 */
	public boolean updateClassify(Classify classIfy);
	
	
	/**
	 *  根据分类编号进行删除
	 * @param id
	 * @return
	 */
	public boolean deleteClassifyById(int id);
	
	
	/**
	 *根据分类编号进行批量删除
	 * @param ids
	 * @return
	 */
	public boolean batchDelClassifyById(int [] ids);
	
	/**
	 * 添加
	 * @param classIfy
	 * @return
	 */
	public boolean addClassify(Classify classIfy);
	
}
