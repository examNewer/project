package com.newer.exam.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.newer.exam.base.RestResponse;
import com.newer.exam.domain.Exam;
import com.newer.exam.domain.ExercisesClassify;
import com.newer.exam.dto.ExamDto;
import com.newer.exam.services.ExamService;
import com.newer.exam.services.ExercisesClassifyService;
import com.newer.exam.utility.DateTimeUtil;
import com.newer.exam.utility.PageInfoHelper;
import com.newer.exam.viewmodel.exam.ExamEditRequestVM;
import com.newer.exam.viewmodel.exam.ExamPaperPageRequestVM;
import com.newer.exam.viewmodel.exam.ExamResponseVM;

@RestController("ExamController")
@RequestMapping(value = "/api/exam")
public class ExamController {
	@Autowired
	private ExamService examService;
	
	@RequestMapping(value = "/page", method = RequestMethod.POST)
	public RestResponse	<PageInfo <ExamResponseVM>> pageList(@RequestBody ExamPaperPageRequestVM model){
		 PageInfo<ExamDto> pageInfo = examService.page(model);
	        PageInfo<ExamResponseVM> page = PageInfoHelper.copyMap(pageInfo, e -> {
	            ExamResponseVM vm = new ExamResponseVM();
	            vm.setEid(e.getEid());
	            System.out.println(e.getExamCode());
	            vm.setExamCode(e.getExamCode());
	            vm.setCeName(e.getExercisesClassify().getCeName());
	            vm.setCreateTime(DateTimeUtil.dateFormat(e.getCreateTime()));
	            return vm;
	        });
	        return RestResponse.ok(page);
	}
	
	@Autowired
	private ExercisesClassifyService exercisesClassifyService;
	
	@RequestMapping(value="/subject/list" , method = RequestMethod.POST)
	public RestResponse<List<ExercisesClassify>> list(){
		List<ExercisesClassify> exercisesClassify = exercisesClassifyService.selectAll();
		return RestResponse.ok(exercisesClassify);
	}
	
	@RequestMapping(value = "/select/{id}", method = RequestMethod.POST)
    public RestResponse<ExamDto> select(@PathVariable Integer id) {
        ExamDto examDto = examService.examToVM(id);
        ArrayList limitDateTime = new ArrayList<Date>();
        limitDateTime.add(DateTimeUtil.dateFormat(examDto.getBeginTime()));
        limitDateTime.add(DateTimeUtil.dateFormat(examDto.getEndTime()));
        examDto.setSuggestTime(examDto.getExamTimeHour()*60 + examDto.getExamTimeMinute());
        System.out.println(examDto.getSuggestTime());
        examDto.setLimitDateTime(limitDateTime);
        return RestResponse.ok(examDto);
    }
	
	
	 @RequestMapping(value = "/edit", method = RequestMethod.POST)
	 public RestResponse<Exam> edit(@RequestBody @Valid ExamEditRequestVM model){
		 Exam exam = examService.saveExamFromVM(model);
		 System.out.println(exam.toString());
		 return RestResponse.ok(exam);
	 }
	 
	 @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	 public RestResponse delete(@PathVariable Integer id) {
		 examService.deleteById(id);
		 return RestResponse.ok();
	 }
	 
}
