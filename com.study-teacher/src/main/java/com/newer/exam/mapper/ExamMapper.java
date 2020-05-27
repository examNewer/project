package com.newer.exam.mapper;

import java.util.List;

import com.newer.exam.domain.Exam;
import com.newer.exam.dto.ExamDto;
import com.newer.exam.viewmodel.exam.ExamPaperPageRequestVM;

public interface ExamMapper {
	
	Integer insertSelective(Exam exam);
    
    Integer findAllCount();
    
    List<ExamDto> page(ExamPaperPageRequestVM requestVM);
    
    ExamDto examToVM(Integer eid);
    
    Integer deleteByPrimaryKey(Integer eid);
    
    Integer updateByPrimaryKey(Exam exam);
}