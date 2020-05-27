package com.newer.exam.mapper;

import java.util.List;

import com.newer.exam.domain.ExercisesClassify;

public interface ExercisesClassifyMapper {
    int deleteByPrimaryKey(Integer ceId);

    int insert(ExercisesClassify record);

    int insertSelective(ExercisesClassify record);

    ExercisesClassify selectByPrimaryKey(Integer ceId);

    int updateByPrimaryKeySelective(ExercisesClassify record);

    int updateByPrimaryKey(ExercisesClassify record);
    
    List<ExercisesClassify> selectAll();
}