package com.study.sysadmin.domain;

import java.util.Date;

//系统日志表
public class Syslog {
	private Integer id;//编号
	private Administrator admin;//管理员
	private String content;//内容
	private Date updateTime;//更新时间
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Administrator getAdmin() {
		return admin;
	}
	public void setAdmin(Administrator admin) {
		this.admin = admin;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Syslog [id=" + id + ", admin=" + admin + ", content=" + content + ", updateTime=" + updateTime + "]";
	}
	public Syslog(Integer id, Administrator admin, String content, Date updateTime) {
		super();
		this.id = id;
		this.admin = admin;
		this.content = content;
		this.updateTime = updateTime;
	}
	
}
