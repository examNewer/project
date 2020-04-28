package com.study.sysadmin.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.study.api.domain.Classify;
import com.study.api.dto.MsgDto;
import com.study.api.dto.PageDto;
import com.study.sysadmin.dto.UserDto;
import com.study.sysadmin.service.ClassifyService;

@RestController
@CrossOrigin
@RequestMapping("classify")
public class ClassifyController {
	
	@Autowired
	private ClassifyService service;
	
	
	/**
	 * 查询所有返回分页对象
	 * @param dto
	 * @return
	 */
	@RequestMapping("findAll")
	public PageInfo<Classify> findAll(PageDto dto,HttpSession session) {
		PageInfo<Classify> pageInfo=this.service.findClassifyAll(dto);
		return pageInfo;
	}
	
	@RequestMapping("delete")
	public MsgDto delete(int id) {
		boolean temp=this.service.deleteClassifyById(id);
		return new MsgDto(temp, "删除");
	}
	
	@RequestMapping("add")
	public MsgDto add(Classify classIfy) {
		boolean temp=this.service.addClassify(classIfy);
		return new MsgDto(temp, "添加");
	}
	
	
	@RequestMapping("batchDelete")
	public MsgDto batchDelete(int [] ids) {
		boolean temp=this.service.batchDelClassifyById(ids);
		return new MsgDto(temp, "批量删除");
	}
	
	
	@RequestMapping("update")
	public MsgDto update(Classify classIfy) {
		boolean temp=this.service.updateClassify(classIfy);
		return new MsgDto(temp, "修改");
	}
}
