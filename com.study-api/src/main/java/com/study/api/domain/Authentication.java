package com.study.api.domain;

//认证
public class Authentication {
	private Integer authenticationId;//编号
	private TeaUser teaUser;//教师用户
	private String authenticationName;//认证姓名
	private String identity;//身份证号
	private String phone;//联系电话
	private String school;//学校
	public Integer getAuthenticationId() {
		return authenticationId;
	}
	public void setAuthenticationId(Integer authenticationId) {
		this.authenticationId = authenticationId;
	}
	public TeaUser getTeaUser() {
		return teaUser;
	}
	public void setTeaUser(TeaUser teaUser) {
		this.teaUser = teaUser;
	}
	public String getAuthenticationName() {
		return authenticationName;
	}
	public void setAuthenticationName(String authenticationName) {
		this.authenticationName = authenticationName;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public Authentication(Integer authenticationId, TeaUser teaUser, String authenticationName, String identity,
			String phone, String school) {
		this.authenticationId = authenticationId;
		this.teaUser = teaUser;
		this.authenticationName = authenticationName;
		this.identity = identity;
		this.phone = phone;
		this.school = school;
	}
	
	public Authentication() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Authentication [authenticationId=" + authenticationId + ", teaUser=" + teaUser + ", authenticationName="
				+ authenticationName + ", identity=" + identity + ", phone=" + phone + ", school=" + school + "]";
	}
	
	
}
