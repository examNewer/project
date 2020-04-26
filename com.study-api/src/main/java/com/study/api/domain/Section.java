package com.study.api.domain;

import java.util.Date;

//课节
public class Section {
	private Integer sId;//课节编号
	private Curriculum curriculum;//所属章节
	private String sName;//课节名称
	private Date time;//时长
	private String video;//视频地址
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public Curriculum getCurriculum() {
		return curriculum;
	}
	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	
	public Section() {
		// TODO Auto-generated constructor stub
	}
	public Section(Integer sId, Curriculum curriculum, String sName, Date time, String video) {
		this.sId = sId;
		this.curriculum = curriculum;
		this.sName = sName;
		this.time = time;
		this.video = video;
	}
	@Override
	public String toString() {
		return "Section [sId=" + sId + ", curriculum=" + curriculum + ", sName=" + sName + ", time=" + time + ", video="
				+ video + "]";
	}
	
	
}
