package com.newer.exam.mapper;

import java.util.List;

import com.newer.exam.domain.Curriculum;
import com.newer.exam.viewmodel.curriculum.CurriculumEditRequestVM;
import com.newer.exam.viewmodel.curriculum.CurriculumPageRequestVM;

public interface CurriculumMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Curriculum record);

    int insertSelective(Curriculum record);

    Curriculum selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Curriculum record);

    int updateByPrimaryKey(Curriculum record);
    
    Integer selectAllCount();
    
    List<Curriculum> page(CurriculumPageRequestVM requestVM);
    
    CurriculumEditRequestVM selectAndSectionByPrimaryKey(Integer cid);
}