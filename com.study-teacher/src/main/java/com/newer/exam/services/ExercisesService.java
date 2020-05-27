package com.newer.exam.services;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.newer.exam.domain.Exercises;
import com.newer.exam.viewmodel.exercises.ExercisesEditRequestVM;
import com.newer.exam.viewmodel.exercises.ExercisesPageRequestVM;

public interface ExercisesService extends BaseService<Exercises> {
	
	/**
	 * 查询所有课题
	 * @return 所有课题信息
	 */
	List<Exercises> findAll();
	
	/**
	 * 统计所有试题数量
	 * @return 所有试题数量
	 */
	Integer findAllCount(); 
	
	/**
	 * 分页试题
	 * @param requestVM
	 * @return
	 */
	PageInfo<Exercises> page(ExercisesPageRequestVM requestVM);
	
	/**
	 * 根据Id查询试题基本信息
	 * @param id
	 * @return
	 */
	ExercisesEditRequestVM getExercisesEditRequsetVM(Integer id);
	
	/**
	 * 试题映射
	 * @param exercises
	 * @return
	 */
	ExercisesEditRequestVM getExercisesEditRequsetVM(Exercises exercises);
	
	/**
	 * 新增试题
	 * @param exercisesVM
	 * @return
	 */
	Integer insterExercises(ExercisesEditRequestVM exercisesVM);
	
	/**
	 * 修改试题
	 * @param exercisesVM
	 * @return
	 */
	Integer updateExercises(ExercisesEditRequestVM exercisesVM);
	
	
}
