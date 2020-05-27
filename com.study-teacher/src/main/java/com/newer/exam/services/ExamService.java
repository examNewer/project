package com.newer.exam.services;



import com.github.pagehelper.PageInfo;
import com.newer.exam.domain.Exam;
import com.newer.exam.dto.ExamDto;
import com.newer.exam.viewmodel.exam.ExamEditRequestVM;
import com.newer.exam.viewmodel.exam.ExamPaperPageRequestVM;

public interface ExamService extends BaseService<Exam> {
	/**
	 * 查询所有试卷，并且进行分页
	 * 
	 * @return 所有试卷的分页信息
	 */
	PageInfo<ExamDto> page(ExamPaperPageRequestVM requestVM);

	/**
	 * 统计所有试卷数量
	 * 
	 * @return 所有试题数量
	 */
	Integer findAllCount();
	
	/**
	 * 根据试卷Id查询试卷信息
	 * @param eid
	 * @return 指定试卷的信息
	 */
	ExamDto examToVM(Integer eid);
	
	/**
	 * 新增考试试卷
	 * @param examEditRequestVM
	 * @return 试卷对象
	 */
	Exam saveExamFromVM(ExamEditRequestVM examEditRequestVM);
	
	
}
