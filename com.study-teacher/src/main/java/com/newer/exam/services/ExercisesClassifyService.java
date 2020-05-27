package com.newer.exam.services;

import java.util.List;

import com.newer.exam.domain.ExercisesClassify;

public interface ExercisesClassifyService extends BaseService<ExercisesClassify> {
	/**
	 * 查询所有类别
	 * @return 所有类别数据
	 */
	List<ExercisesClassify> selectAll();

}
