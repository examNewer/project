/**
 * 
 */
package com.study.student.service;

import java.util.List;

import com.study.api.domain.Classify;

/**
 * @author 黄达
 *
 * 2020年5月2日
 */
public interface ClassifyService {
	/**
	  * 查询所有类别
	 * @return
	 */
	public List<Classify> findClassifies();

}
