package com.study.sysadmin.domain;

//系统通知
public class Inform {
	private Integer infromId;//编号
	private Administrator admin;//管理员
	private String infromInfo;//内容
	
	public Integer getInfromId() {
		return infromId;
	}
	public void setInfromId(Integer infromId) {
		this.infromId = infromId;
	}
	public Administrator getAdmin() {
		return admin;
	}
	public void setAdmin(Administrator admin) {
		this.admin = admin;
	}
	public String getInfromInfo() {
		return infromInfo;
	}
	public void setInfromInfo(String infromInfo) {
		this.infromInfo = infromInfo;
	}
	public Inform(Integer infromId, Administrator admin, String infromInfo) {
		super();
		this.infromId = infromId;
		this.admin = admin;
		this.infromInfo = infromInfo;
	}
	@Override
	public String toString() {
		return "Inform [infromId=" + infromId + ", admin=" + admin + ", infromInfo=" + infromInfo + "]";
	}
	
	public Inform() {
		// TODO Auto-generated constructor stub
	}
}
