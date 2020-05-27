package com.newer.exam.services.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.exam.domain.Curriculum;
import com.newer.exam.mapper.CurriculumMapper;
import com.newer.exam.services.CurriculumService;
import com.newer.exam.utility.ModelMapperSingle;
import com.newer.exam.viewmodel.curriculum.CurriculumEditRequestVM;
import com.newer.exam.viewmodel.curriculum.CurriculumPageRequestVM;

@Service
public class CurriculumServiceImpl implements CurriculumService {
	
	@Autowired
	private CurriculumMapper curriculumMapper;
	protected final static ModelMapper modelMapper = ModelMapperSingle.Instance();

	@Override
	public int deleteById(Integer cid) {
		
		return (curriculumMapper.deleteByPrimaryKey(cid)>0) ? 1 : 0;
	}

	@Override
	public int insert(Curriculum record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertByFilter(Curriculum record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Curriculum selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByIdFilter(Curriculum record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateById(Curriculum record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Curriculum> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectAllCount() {
		// TODO Auto-generated method stub
		return curriculumMapper.selectAllCount();
	}

	@Override
	public PageInfo<Curriculum> page(CurriculumPageRequestVM requestVM) {
		return PageHelper.startPage(requestVM.getPageIndex(), requestVM.getPageSize(), "cid desc").doSelectPageInfo(() ->
		curriculumMapper.page(requestVM)
		);
	}

	@Override
	public Curriculum saveCurriculumByVm(CurriculumEditRequestVM requestVM) {
		Curriculum curriculum = modelMapper.map(requestVM, Curriculum.class);
		return (curriculumMapper.insertSelective(curriculum)>0)?curriculum : null;
	}

	@Override
	public Curriculum updateCurriculumByVm(CurriculumEditRequestVM requestVM) {
		Curriculum curriculum = modelMapper.map(requestVM, Curriculum.class);
		return (curriculumMapper.updateByPrimaryKeySelective(curriculum)>0)?curriculum : null;
	}

	@Override
	public CurriculumEditRequestVM getCurriculumEditRequestVM(Integer cid) {
		CurriculumEditRequestVM curriculumEditRequestVM = curriculumMapper.selectAndSectionByPrimaryKey(cid);
		return curriculumEditRequestVM;
	}

}
