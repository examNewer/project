package com.newer.exam.dto;

import java.util.Date;
import java.util.List;

import com.newer.exam.domain.Exam;
import com.newer.exam.domain.ExercisesClassify;
import com.newer.exam.domain.Teacher;

public class ExamDto extends Exam {
	private ExercisesClassify exercisesClassify;
	
	private List limitDateTime;
	
	private static Integer paperType = 4 ;
	
	private Integer suggestTime;
	
	
	
	public static Integer getPaperType() {
		return paperType;
	}

	public static void setPaperType(Integer paperType) {
		ExamDto.paperType = paperType;
	}

	public Integer getSuggestTime() {
		return suggestTime;
	}

	public void setSuggestTime(Integer suggestTime) {
		this.suggestTime = suggestTime;
	}

	public List getLimitDateTime() {
		return limitDateTime;
	}

	public void setLimitDateTime(List limitDateTime) {
		this.limitDateTime = limitDateTime;
	}

	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ExercisesClassify getExercisesClassify() {
		return exercisesClassify;
	}

	public void setExercisesClassify(ExercisesClassify exercisesClassify) {
		this.exercisesClassify = exercisesClassify;
	}
	
	
}
