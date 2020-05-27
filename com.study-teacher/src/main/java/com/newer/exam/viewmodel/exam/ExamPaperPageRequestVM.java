package com.newer.exam.viewmodel.exam;


import com.newer.exam.base.BasePage;

import lombok.Data;

@Data
public class ExamPaperPageRequestVM extends BasePage {

    private Integer eid;
    private Integer ceId;
	private Integer level;
    private Integer paperType;
    private Integer taskExamId;
    
    
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public Integer getCeId() {
		return ceId;
	}
	public void setCeId(Integer ceId) {
		this.ceId = ceId;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getPaperType() {
		return paperType;
	}
	public void setPaperType(Integer paperType) {
		this.paperType = paperType;
	}
	public Integer getTaskExamId() {
		return taskExamId;
	}
	public void setTaskExamId(Integer taskExamId) {
		this.taskExamId = taskExamId;
	}
    
    

}
