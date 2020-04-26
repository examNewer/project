package com.study.sysadmin.domain;


//系统管理员
public class Administrator {
	private Integer adminId;//管理员编号
	private String adminName;//管理员姓名
	private String adminHeadPortrait;//管理员头像
	private String adminAccount;//管理员账号
	private String adminPwd;//管理员密码
	
	
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminHeadPortrait() {
		return adminHeadPortrait;
	}
	public void setAdminHeadPortrait(String adminHeadPortrait) {
		this.adminHeadPortrait = adminHeadPortrait;
	}
	public String getAdminAccount() {
		return adminAccount;
	}
	public void setAdminAccount(String adminAccount) {
		this.adminAccount = adminAccount;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	
	public Administrator() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Administrator [adminId=" + adminId + ", adminName=" + adminName + ", adminHeadPortrait="
				+ adminHeadPortrait + ", adminAccount=" + adminAccount + ", adminPwd=" + adminPwd + "]";
	}
	public Administrator(Integer adminId, String adminName, String adminHeadPortrait, String adminAccount,
			String adminPwd) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminHeadPortrait = adminHeadPortrait;
		this.adminAccount = adminAccount;
		this.adminPwd = adminPwd;
	}
}
