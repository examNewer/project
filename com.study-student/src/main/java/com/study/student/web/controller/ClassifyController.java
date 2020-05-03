/**
 * 
 */
package com.study.student.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.api.domain.Classify;
import com.study.student.service.ClassifyService;

/**
 * @author 黄达
 *
 * 2020年5月2日
 */
@RestController
public class ClassifyController {
	@Autowired
	private ClassifyService classifyService;
	
	@RequestMapping(value = "findClassifies")
	public List<Classify> findClassifies() {
		return this.classifyService.findClassifies();
	}
}
