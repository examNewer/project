/**
 * 
 */
package com.study.student.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.study.api.domain.Curriculum;
import com.study.student.dto.PageDto;
import com.study.student.service.CurriculumService;

/**
 * @author 黄达
 *
 * 2020年5月2日
 */
@RestController
public class CurriculumController {
	@Autowired
	private CurriculumService curriculumService;
	@RequestMapping(value = "findCurriculums")
	public PageInfo<Curriculum> findCurriculums(String ceId, String isPay,String cname,PageDto dto ,Integer page, Integer pageSize) {
		dto.setPage(page);
		dto.setPageSize(pageSize);
		return this.curriculumService.findCurriculums(ceId, isPay,cname,dto);
	}
	@RequestMapping(value = "findCurriculumById")
	public Curriculum findCurriculumById(Integer cId) {
		return this.curriculumService.findCurriculumById(cId);
	};
}
