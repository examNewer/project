package com.newer.exam.viewmodel.exam;



public class ExamResponseVM {
    private Integer eid;

    private String examCode;

    private Integer ceId;
    
    private String ceName;

    private String createTime;

    private Integer createTeacher;
    
    private String createTeacherName;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getExamCode() {
		return examCode;
	}

	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public Integer getCeId() {
		return ceId;
	}

	public void setCeId(Integer ceId) {
		this.ceId = ceId;
	}

	public String getCeName() {
		return ceName;
	}

	public void setCeName(String ceName) {
		this.ceName = ceName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Integer getCreateTeacher() {
		return createTeacher;
	}

	public void setCreateTeacher(Integer createTeacher) {
		this.createTeacher = createTeacher;
	}

	public String getCreateTeacherName() {
		return createTeacherName;
	}

	public void setCreateTeacherName(String createTeacherName) {
		this.createTeacherName = createTeacherName;
	}
    
    

}
