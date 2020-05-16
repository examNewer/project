package com.study.api.domain;

import java.util.Date;

import javax.persistence.Table;

//课节
@Table(name="Section")
public class Section {
	private Integer sId;//课节编号
	private Integer cid;//所属课程编号
	private Curriculum curriculum;//所属课程
	private String sName;//课节名称
	private String time;//时长
	private String video;//视频地址
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
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
	public Section(Integer sId, Integer cid, Curriculum curriculum, String sName, String time, String video) {
		super();
		this.sId = sId;
		this.cid = cid;
		this.curriculum = curriculum;
		this.sName = sName;
		this.time = time;
		this.video = video;
	}
	@Override
	public String toString() {
		return "Section [sId=" + sId + ", cid=" + cid + ", curriculum=" + curriculum + ", sName=" + sName + ", time="
				+ time + ", video=" + video + "]";
	}
	
	
	
}
