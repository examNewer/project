package com.newer.exam.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.exam.domain.Exercises;
import com.newer.exam.mapper.ExercisesMapper;
import com.newer.exam.services.ExercisesService;
import com.newer.exam.services.enums.ExercisesTypeEnum;
import com.newer.exam.utility.ModelMapperSingle;
import com.newer.exam.viewmodel.exercises.ExercisesEditItemVM;
import com.newer.exam.viewmodel.exercises.ExercisesEditRequestVM;
import com.newer.exam.viewmodel.exercises.ExercisesPageRequestVM;

@Service
public class ExercisesServiceImpl extends BaseServiceImpl<Exercises> implements ExercisesService {
	
	
	  @Autowired 
	  private ExercisesMapper exercisesMapper;
	  protected final static ModelMapper modelMapper = ModelMapperSingle.Instance();

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return exercisesMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Exercises record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertByFilter(Exercises record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Exercises selectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByIdFilter(Exercises record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateById(Exercises record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Exercises> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer findAllCount() {
		// TODO Auto-generated method stub
		return exercisesMapper.findAllCount();
	}

	@Override
	public PageInfo<Exercises> page(ExercisesPageRequestVM requestVM) {
		// TODO Auto-generated method stub
		return PageHelper.startPage(requestVM.getPageIndex(),requestVM.getPageSize(), "id desc").doSelectPageInfo(()->
					exercisesMapper.page(requestVM)
				);
	}

	@Override
	public ExercisesEditRequestVM getExercisesEditRequsetVM(Integer id) {
		Exercises exercises = exercisesMapper.selectByPrimaryKey(id);
		return getExercisesEditRequsetVM(exercises);
	}

	@Override
	public ExercisesEditRequestVM getExercisesEditRequsetVM(Exercises exercises) {
		ExercisesEditRequestVM exercisesEditRequestVM = modelMapper.map(exercises,ExercisesEditRequestVM.class);
		
		switch(exercises.getType()) {
		case "单选题":
			exercisesEditRequestVM.setAnswer(exercises.getAnswer());
			break;
		case "多选题":
			String[] temp = exercises.getAnswer().split(",");
			ArrayList<String> array = new ArrayList<String>(); 
			for(String x : temp) {
				array.add(x);
			}
			exercisesEditRequestVM.setAnswerArray(array);
			break;
		default:
			break;
		
		}
		List<ExercisesEditItemVM> editItems = new ArrayList<ExercisesEditItemVM>();
		editItems.add(new ExercisesEditItemVM("A",exercises.getOption1()));
		editItems.add(new ExercisesEditItemVM("B",exercises.getOption2()));
		editItems.add(new ExercisesEditItemVM("C",exercises.getOption3()));
		editItems.add(new ExercisesEditItemVM("D",exercises.getOption4()));
		
		exercisesEditRequestVM.setItems(editItems);
		return exercisesEditRequestVM;
	}

	@Override
	public Integer insterExercises(ExercisesEditRequestVM exercisesVM) {
		Exercises exercises;
		if("单选题".equals(exercisesVM.getType())) {
		exercises = modelMapper.map(exercisesVM,Exercises.class);
		exercises.setOption1(exercisesVM.getItems().get(0).getContent());
		exercises.setOption2(exercisesVM.getItems().get(1).getContent());
		exercises.setOption3(exercisesVM.getItems().get(2).getContent());
		exercises.setOption4(exercisesVM.getItems().get(3).getContent());
		}else {
		exercises = modelMapper.map(exercisesVM,Exercises.class);
		exercises.setOption1(exercisesVM.getItems().get(0).getContent());
		exercises.setOption2(exercisesVM.getItems().get(1).getContent());
		exercises.setOption3(exercisesVM.getItems().get(2).getContent());
		exercises.setOption4(exercisesVM.getItems().get(3).getContent());
		StringBuffer stringBuffer = new StringBuffer();
		for(int y=0; y<exercisesVM.getAnswerArray().size();y++) {
			if(y==0) {
			stringBuffer.append(exercisesVM.getAnswerArray().get(y));
			}else {
				stringBuffer.append("," + exercisesVM.getAnswerArray().get(y));
			}
		}
		exercises.setAnswer(stringBuffer.toString());
		}
		return exercisesMapper.insertSelective(exercises);
	}

	@Override
	public Integer updateExercises(ExercisesEditRequestVM exercisesVM) {
		Exercises exercises;
		if("单选题".equals(exercisesVM.getType())) {
		exercises = modelMapper.map(exercisesVM,Exercises.class);
		exercises.setOption1(exercisesVM.getItems().get(0).getContent());
		exercises.setOption2(exercisesVM.getItems().get(1).getContent());
		exercises.setOption3(exercisesVM.getItems().get(2).getContent());
		exercises.setOption4(exercisesVM.getItems().get(3).getContent());
		}else {
		exercises = modelMapper.map(exercisesVM,Exercises.class);
		exercises.setOption1(exercisesVM.getItems().get(0).getContent());
		exercises.setOption2(exercisesVM.getItems().get(1).getContent());
		exercises.setOption3(exercisesVM.getItems().get(2).getContent());
		exercises.setOption4(exercisesVM.getItems().get(3).getContent());
		StringBuffer stringBuffer = new StringBuffer();
		for(int y=0; y<exercisesVM.getAnswerArray().size();y++) {
			if(y==0) {
			stringBuffer.append(exercisesVM.getAnswerArray().get(y));
			}else {
				stringBuffer.append("," + exercisesVM.getAnswerArray().get(y));
			}
		}
		exercises.setAnswer(stringBuffer.toString());
		}
		return exercisesMapper.updateByPrimaryKeySelective(exercises);
	}

}
