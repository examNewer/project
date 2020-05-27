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
import com.newer.exam.domain.Curriculum;
import com.newer.exam.services.CurriculumService;
import com.newer.exam.utility.PageInfoHelper;
import com.newer.exam.viewmodel.curriculum.CurriculumEditRequestVM;
import com.newer.exam.viewmodel.curriculum.CurriculumPageRequestVM;
import com.newer.exam.viewmodel.curriculum.CurriculumResponseVM;

@RestController("CurriculumController")
@RequestMapping(value = "/api/Curriculum")
@Controller
public class CurriculumController extends BaseApiController {

	@Autowired
	private CurriculumService curriculumService;
	
	 @RequestMapping(value = "/subject/page", method = RequestMethod.POST)
	    public RestResponse<PageInfo<CurriculumResponseVM>> pageList(@RequestBody CurriculumPageRequestVM model) {
	        PageInfo<Curriculum> pageInfo = curriculumService.page(model);
	        PageInfo<CurriculumResponseVM> page = PageInfoHelper.copyMap(pageInfo, e -> modelMapper.map(e, CurriculumResponseVM.class));
	        return RestResponse.ok(page);
	    }
	 
	 @RequestMapping(value = "/subject/edit", method = RequestMethod.POST)
	 public RestResponse edit(@RequestBody @Valid CurriculumEditRequestVM model) {
		 Curriculum curriculum;
		 if(model.getCid()==null) {
		 curriculum = curriculumService.saveCurriculumByVm(model);
		 }else {
			 curriculum = curriculumService.updateCurriculumByVm(model);
		 }
		 return RestResponse.ok(curriculum);
	 }
	 
	 @RequestMapping(value = "/subject/select/{id}", method = RequestMethod.POST)
	 public RestResponse<CurriculumEditRequestVM> select(@PathVariable Integer id) {
		 CurriculumEditRequestVM curriculumEditRequestVM = curriculumService.getCurriculumEditRequestVM(id);
		 return RestResponse.ok(curriculumEditRequestVM);
	 }
	 
	 @RequestMapping(value = "/subject/delete/{id}", method = RequestMethod.POST)
	 public RestResponse delete(@PathVariable Integer id) {
		 return curriculumService.deleteById(id)>0 ? RestResponse.ok() : null;
	 }
}
