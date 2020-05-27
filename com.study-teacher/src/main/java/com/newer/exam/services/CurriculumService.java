package com.newer.exam.services;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.newer.exam.domain.Curriculum;
import com.newer.exam.viewmodel.curriculum.CurriculumEditRequestVM;
import com.newer.exam.viewmodel.curriculum.CurriculumPageRequestVM;

public interface CurriculumService extends BaseService<Curriculum> {
	/**
	 * 查询所有课程
	 * @return 所有课程信息
	 */
	List<Curriculum> selectAll();
	
	/**
	 * 统计所有课程数量
	 * @return 所有课程数量
	 */
	Integer selectAllCount(); 
	
	/**
	 * 分页课程
	 * @param requestVM
	 * @return
	 */
	PageInfo<Curriculum> page(CurriculumPageRequestVM requestVM);
	
	Curriculum saveCurriculumByVm(CurriculumEditRequestVM requestVM);
	
	Curriculum updateCurriculumByVm(CurriculumEditRequestVM requestVM);
	
	CurriculumEditRequestVM getCurriculumEditRequestVM(Integer cid);
}
