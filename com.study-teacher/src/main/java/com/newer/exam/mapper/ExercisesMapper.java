package com.newer.exam.mapper;

import java.util.List;

import com.newer.exam.domain.Exercises;
import com.newer.exam.viewmodel.exercises.ExercisesEditRequestVM;
import com.newer.exam.viewmodel.exercises.ExercisesPageRequestVM;

public interface ExercisesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Exercises record);

    int insertSelective(Exercises record);

    Exercises selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Exercises record);

    int updateByPrimaryKey(Exercises record);
    
    Integer findAllCount();
    
    List<Exercises> page(ExercisesPageRequestVM requestVM);
    
}