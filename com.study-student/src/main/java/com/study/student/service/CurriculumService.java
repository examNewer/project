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
	public PageInfo<Curriculum> findCurriculums(String ceId,String isPay,String cname,PageDto pageDto);
	/**
	 * 根据课程编号查询该课程的课程信息，所有章节信息，所有评论信息，发布该课程的教师信息
	 * @param cId
	 * @return
	 */
	public Curriculum findCurriculumById(Integer cId);

}
