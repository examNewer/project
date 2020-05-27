package com.newer.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.newer.exam.base.RestResponse;
import com.newer.exam.domain.ExercisesClassify;
import com.newer.exam.services.ExercisesClassifyService;

@RestController("ExercisesClassifyController")
@RequestMapping(value="/api/subjec")
@Controller
public class ExercisesClassifyController {
	@Autowired
	private ExercisesClassifyService exercisesClassifyService;
	
	@RequestMapping(value="/list" , method = RequestMethod.POST)
	public RestResponse<List<ExercisesClassify>> list(){
		List<ExercisesClassify> exercisesClassify = exercisesClassifyService.selectAll();
		return RestResponse.ok(exercisesClassify);
	}
}
