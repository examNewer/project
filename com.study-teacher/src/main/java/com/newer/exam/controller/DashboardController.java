package com.newer.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newer.exam.base.RestResponse;
import com.newer.exam.services.CurriculumService;
import com.newer.exam.services.ExamService;
import com.newer.exam.services.ExercisesService;
import com.newer.exam.services.impl.ExercisesServiceImpl;
import com.newer.exam.utility.DateTimeUtil;
import com.newer.exam.viewmodel.dashboard.IndexVM;

@RestController("DashboardController")
@RequestMapping(value = "/api/dashboard")
@Controller
public class DashboardController {

	@Autowired
	private ExercisesService exercisesService;
	
	@Autowired
	private CurriculumService curriculumService;
	
	@Autowired
	private ExamService examService;
	
	
	

	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public RestResponse<IndexVM> index() {
		IndexVM vm = new IndexVM();
		System.out.println("1");
		Integer exercisesAllCount = exercisesService.findAllCount();
		Integer curriculumAllCount = curriculumService.selectAllCount();
		Integer examAllCount = examService.findAllCount();

		vm.setMothDayText(DateTimeUtil.MothDay());
		vm.setExamAllCount(examAllCount);
		vm.setCurriculumAllCount(curriculumAllCount);
		vm.setExercisesAllCount(exercisesAllCount);
		return RestResponse.ok(vm);
	}

}
