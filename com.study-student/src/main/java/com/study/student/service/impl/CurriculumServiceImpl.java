/**
 * 
 */
package com.study.student.service.impl;


import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.api.domain.Curriculum;
import com.study.student.dao.CurriculumMapper;
import com.study.student.dto.CurriculumDto;
import com.study.student.dto.PageDto;
import com.study.student.service.CurriculumService;

/**
 * @author 黄达
 *
 * 2020年5月2日
 */
@Service
public class CurriculumServiceImpl implements CurriculumService{
	@Autowired
	private CurriculumMapper curriculumMapper;
	@Override
	public PageInfo<Curriculum> findCurriculums(String ceId, String isPay,String cname,PageDto pageDto) {
		// TODO Auto-generated method stub
		//CurriculumDto dto=new CurriculumDto(ceId,isPay);
		if("全部".equals(ceId)) {
			ceId="";
		}
		if("全部".equals(isPay)) {
			isPay="";
		}
		PageHelper.startPage(pageDto.getPage(), pageDto.getPageSize());
		List<Curriculum> list=this.curriculumMapper.findCurriculums("%"+ceId+"%","%"+isPay+"%","%"+cname+"%");
		return new PageInfo<Curriculum>(list);
	}
	@Override
	public Curriculum findCurriculumById(Integer cId) {
		// TODO Auto-generated method stub
		return this.curriculumMapper.findCurriculumById(cId);
	}

}
