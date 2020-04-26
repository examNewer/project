package com.study.api.domain;


//教师用户
public class TeaUser {
	private Integer tid; //教师编号
	private String userName;//教师用户名
	private String realName;//真实姓名
	private String pwd;//密码
	private String isAuthen;//认证信息
	private String headImg;//头像
	private String sex;//性别
	private String bgImg1;//背景图123
	private String bgImg2;
	private String bgImg3;
	private String briefImg;//简介图
	private String intorduceImg;//介绍图
	private String brief;//简单介绍
	private String detailIntorduce;//详细介绍
	private int status;//状态
	private int isEnter;//是否入住
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getIsAuthen() {
		return isAuthen;
	}
	public void setIsAuthen(String isAuthen) {
		this.isAuthen = isAuthen;
	}
	public String getHeadImg() {
		return headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBgImg1() {
		return bgImg1;
	}
	public void setBgImg1(String bgImg1) {
		this.bgImg1 = bgImg1;
	}
	public String getBgImg2() {
		return bgImg2;
	}
	public void setBgImg2(String bgImg2) {
		this.bgImg2 = bgImg2;
	}
	public String getBgImg3() {
		return bgImg3;
	}
	public void setBgImg3(String bgImg3) {
		this.bgImg3 = bgImg3;
	}
	public String getBriefImg() {
		return briefImg;
	}
	public void setBriefImg(String briefImg) {
		this.briefImg = briefImg;
	}
	public String getIntorduceImg() {
		return intorduceImg;
	}
	public void setIntorduceImg(String intorduceImg) {
		this.intorduceImg = intorduceImg;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getDetailIntorduce() {
		return detailIntorduce;
	}
	public void setDetailIntorduce(String detailIntorduce) {
		this.detailIntorduce = detailIntorduce;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getIsEnter() {
		return isEnter;
	}
	public void setIsEnter(int isEnter) {
		this.isEnter = isEnter;
	}
	public TeaUser(Integer tid, String userName, String realName, String pwd, String isAuthen, String headImg,
			String sex, String bgImg1, String bgImg2, String bgImg3, String briefImg, String intorduceImg, String brief,
			String detailIntorduce, int status, int isEnter) {
		super();
		this.tid = tid;
		this.userName = userName;
		this.realName = realName;
		this.pwd = pwd;
		this.isAuthen = isAuthen;
		this.headImg = headImg;
		this.sex = sex;
		this.bgImg1 = bgImg1;
		this.bgImg2 = bgImg2;
		this.bgImg3 = bgImg3;
		this.briefImg = briefImg;
		this.intorduceImg = intorduceImg;
		this.brief = brief;
		this.detailIntorduce = detailIntorduce;
		this.status = status;
		this.isEnter = isEnter;
	}
	
	public TeaUser() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TeaUser [tid=" + tid + ", userName=" + userName + ", realName=" + realName + ", pwd=" + pwd
				+ ", isAuthen=" + isAuthen + ", headImg=" + headImg + ", sex=" + sex + ", bgImg1=" + bgImg1
				+ ", bgImg2=" + bgImg2 + ", bgImg3=" + bgImg3 + ", briefImg=" + briefImg + ", intorduceImg="
				+ intorduceImg + ", brief=" + brief + ", detailIntorduce=" + detailIntorduce + ", status=" + status
				+ ", isEnter=" + isEnter + "]";
	}
}
