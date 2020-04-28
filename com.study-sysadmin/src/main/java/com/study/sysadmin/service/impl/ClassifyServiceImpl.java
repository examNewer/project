package com.study.sysadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.api.domain.Classify;
import com.study.api.dto.MsgDto;
import com.study.api.dto.PageDto;
import com.study.sysadmin.dao.ClassifyDao;
import com.study.sysadmin.service.ClassifyService;

@Service
public class ClassifyServiceImpl implements ClassifyService{

	@Autowired
	private ClassifyDao dao;
	
	/**
	 * 查询所有类型
	 * @return
	 */
	public PageInfo<Classify> findClassifyAll(PageDto dto) {
		PageHelper.startPage(dto.getPage(), dto.getPageSize());
		List list= this.dao.selectAll();
		PageInfo pageInfo=new PageInfo(list);
		return pageInfo;
	}

	/**
	 * 根据分类编号进行修改
	 * @param id
	 * @return
	 */
	public boolean updateClassify(Classify classIfy) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(classIfy)>0?true:false;
	}

	/**
	 *  根据分类编号进行删除
	 * @param id
	 * @return
	 */
	public boolean deleteClassifyById(int id) {
		return dao.deleteByPrimaryKey(id)>0?true:false;
	}

	/**
	 *根据分类编号进行批量删除
	 * @param ids
	 * @return
	 */
	public boolean batchDelClassifyById(int[] ids) {
		boolean result = false;
		for(int id : ids) {
			result=this.deleteClassifyById(id);
		}
		return result;
	}

	/**
	 * 添加
	 * @param classIfy
	 * @return
	 */
	public boolean addClassify(Classify classIfy) {
		MsgDto msg=new MsgDto();
		return dao.insert(classIfy)>0?true:false;
	}

}
