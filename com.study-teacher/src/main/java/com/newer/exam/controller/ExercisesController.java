package com.newer.exam.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.newer.exam.base.BaseApiController;
import com.newer.exam.base.RestResponse;
import com.newer.exam.domain.Exercises;
import com.newer.exam.services.ExercisesService;
import com.newer.exam.utility.PageInfoHelper;
import com.newer.exam.viewmodel.exercises.ExercisesEditRequestVM;
import com.newer.exam.viewmodel.exercises.ExercisesPageRequestVM;
import com.newer.exam.viewmodel.exercises.ExercisesResponseVM;

@RestController("ExercisesController")
@RequestMapping(value="/api/exercises")
@Controller
public class ExercisesController extends BaseApiController {
	@Autowired
	private ExercisesService exercisesService;
	
	@RequestMapping(value = "/page", method = RequestMethod.POST)
	public RestResponse<PageInfo<ExercisesResponseVM>> pageList(@RequestBody ExercisesPageRequestVM model){
		PageInfo<Exercises> pageInfo = exercisesService.page(model);
		PageInfo<ExercisesResponseVM> page = PageInfoHelper.copyMap(pageInfo, q->{
			ExercisesResponseVM vm = modelMapper.map(q,ExercisesResponseVM.class);
			System.out.println(vm.toString());
			return vm;
		});
		return RestResponse.ok(page);
	}
	
	@RequestMapping(value = "/select/{id}", method = RequestMethod.POST)
	public RestResponse<ExercisesEditRequestVM> select(@PathVariable Integer id){
		ExercisesEditRequestVM newVm = exercisesService.getExercisesEditRequsetVM(id);
		return RestResponse.ok(newVm);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public RestResponse edit(@RequestBody @Valid ExercisesEditRequestVM model) {
		if(null == model.getId()) {
			exercisesService.insterExercises(model);
		}else {
			exercisesService.updateExercises(model);
		}
		return RestResponse.ok();
	}
	
	 @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	 public RestResponse delete(@PathVariable Integer id) {
		 exercisesService.deleteById(id);
		 return RestResponse.ok();
	 }
	
}
