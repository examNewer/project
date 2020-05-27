package com.newer.exam.viewmodel.dashboard;



import java.util.List;

public class IndexVM {
    private Integer examAllCount;
    private Integer exercisesAllCount;
    private Integer curriculumAllCount;
    private Integer doQuestionCount;
    private List<Integer> mothDayUserActionValue;
    private List<Integer> mothDayDoExamQuestionValue;
    private List<String> mothDayText;
	public Integer getExamAllCount() {
		return examAllCount;
	}
	public void setExamAllCount(Integer examAllCount) {
		this.examAllCount = examAllCount;
	}
	public Integer getExercisesAllCount() {
		return exercisesAllCount;
	}
	public void setExercisesAllCount(Integer exercisesAllCount) {
		this.exercisesAllCount = exercisesAllCount;
	}
	public Integer getCurriculumAllCount() {
		return curriculumAllCount;
	}
	public void setCurriculumAllCount(Integer curriculumAllCount) {
		this.curriculumAllCount = curriculumAllCount;
	}
	public Integer getDoQuestionCount() {
		return doQuestionCount;
	}
	public void setDoQuestionCount(Integer doQuestionCount) {
		this.doQuestionCount = doQuestionCount;
	}
	public List<Integer> getMothDayUserActionValue() {
		return mothDayUserActionValue;
	}
	public void setMothDayUserActionValue(List<Integer> mothDayUserActionValue) {
		this.mothDayUserActionValue = mothDayUserActionValue;
	}
	public List<Integer> getMothDayDoExamQuestionValue() {
		return mothDayDoExamQuestionValue;
	}
	public void setMothDayDoExamQuestionValue(List<Integer> mothDayDoExamQuestionValue) {
		this.mothDayDoExamQuestionValue = mothDayDoExamQuestionValue;
	}
	public List<String> getMothDayText() {
		return mothDayText;
	}
	public void setMothDayText(List<String> mothDayText) {
		this.mothDayText = mothDayText;
	}
    
    
}
