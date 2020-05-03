/**
 * 
 */
package com.study.student.service;


import com.github.pagehelper.PageInfo;
import com.study.api.domain.Curriculum;
import com.study.student.dto.PageDto;

/**
 * @author 黄达
 *
 * 2020年5月2日
 */
public interface CurriculumService {
	/**
	 * 按类别和是否需要VIP条件查询课程并分页
	 * @param ceId
	 * @param isPay
	 * @return
	 */
	public PageInfo<Curriculum> findCurriculums(String ceId,String isPay,PageDto pageDto);

}
