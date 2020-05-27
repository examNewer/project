package com.newer.exam.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.exam.domain.Exam;
import com.newer.exam.dto.ExamDto;
import com.newer.exam.mapper.ExamMapper;
import com.newer.exam.services.enums.ActionEnum;
import com.newer.exam.utility.ExamCodeUtil;
import com.newer.exam.utility.ModelMapperSingle;
import com.newer.exam.viewmodel.exam.ExamEditRequestVM;
import com.newer.exam.viewmodel.exam.ExamPaperPageRequestVM;

@Service
public class ExamServiceImpl implements com.newer.exam.services.ExamService {
	@Autowired
	private ExamMapper examMapper;
	@Autowired
	private final static ModelMapper modelMapper = ModelMapperSingle.Instance();

	@Override
	public int deleteById(Integer eid) {
		return examMapper.deleteByPrimaryKey(eid);
	}

	@Override
	public int insert(Exam record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertByFilter(Exam record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Exam selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByIdFilter(Exam record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateById(Exam record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer findAllCount() {
		// TODO Auto-generated method stub
		return examMapper.findAllCount();
	}

	@Override
	public PageInfo<ExamDto> page(ExamPaperPageRequestVM requestVM) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(requestVM.getPageIndex(), requestVM.getPageSize(), "eid desc")
				.doSelectPageInfo(() -> examMapper.page(requestVM));
	}

	@Override
	public ExamDto examToVM(Integer eid) {
		// TODO Auto-generated method stub
		return examMapper.examToVM(eid);
	}

	@Override
	@Transactional
	public Exam saveExamFromVM(ExamEditRequestVM examEditRequestVM) {
		ActionEnum actionEnum = (examEditRequestVM.getEid() == null )? ActionEnum.ADD : ActionEnum.UPDATE;
		Date now = new Date();
		ExamCodeUtil examCodeUtil = new ExamCodeUtil();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );
		
		Exam exam = null;
		if(actionEnum == ActionEnum.ADD) {
			exam = modelMapper.map(examEditRequestVM,Exam.class);
			exam.setCreateTime(now);
			Integer hour = (int) Math.floor(examEditRequestVM.getSuggestTime() / 60);
			Integer minute = examEditRequestVM.getSuggestTime() % 60;
			List<String> list = examEditRequestVM.getLimitDateTime();
			try {
				exam.setExamCode("E"+examCodeUtil.genUniqueKey());
				System.out.println(exam.getExamCode());
				exam.setExamTimeHour(hour);
				System.out.println(exam.getExamTimeHour());
				exam.setExamTimeMinute(minute);
				System.out.println(exam.getExamTimeMinute());
				exam.setBeginTime(now=sdf.parse(list.get(0)));
				System.out.println(exam.getBeginTime());
				exam.setEndTime(now=sdf.parse(list.get(1)));
				System.out.println(exam.getEndTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			examMapper.insertSelective(exam);
			
		}else {
			exam = modelMapper.map(examEditRequestVM,Exam.class);
			Integer hour = (int) Math.floor(examEditRequestVM.getSuggestTime() / 60);
			Integer minute = examEditRequestVM.getSuggestTime() % 60;
			List<String> list = examEditRequestVM.getLimitDateTime();
			try {
				exam.setCreateTime(sdf.parse(examEditRequestVM.getCreateTime()));
				System.out.println(exam.getCreateTime());
				exam.setExamTimeHour(hour);
				System.out.println(exam.getExamTimeHour());
				exam.setExamTimeMinute(minute);
				System.out.println(exam.getExamTimeMinute());
				exam.setBeginTime(now=sdf.parse(list.get(0)));
				System.out.println(exam.getBeginTime());
				exam.setEndTime(now=sdf.parse(list.get(1)));
				System.out.println(exam.getEndTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(exam.toString());
			System.out.println(examEditRequestVM.toString());
			examMapper.updateByPrimaryKey(exam); 
		}
		return exam;
	}

}
