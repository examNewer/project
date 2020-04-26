package com.study.api.domain;


//课程
public class Curriculum {
	private Integer cId;//课程编号
	private Classify classify;//类别
	private TeaUser teaUser;//教师用户
	private String cName;//课程名字
	private int isPay;//是否需要会员
	private int signNum;//报名数
	private String introduceImg;//课程图
	private String status;//状态
	
	
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public Classify getClassify() {
		return classify;
	}
	public void setClassify(Classify classify) {
		this.classify = classify;
	}
	public TeaUser getTeaUser() {
		return teaUser;
	}
	public void setTeaUser(TeaUser teaUser) {
		this.teaUser = teaUser;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getIsPay() {
		return isPay;
	}
	public void setIsPay(int isPay) {
		this.isPay = isPay;
	}
	public int getSignNum() {
		return signNum;
	}
	public void setSignNum(int signNum) {
		this.signNum = signNum;
	}
	public String getIntroduceImg() {
		return introduceImg;
	}
	public void setIntroduceImg(String introduceImg) {
		this.introduceImg = introduceImg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Curriculum() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Curriculum [cId=" + cId + ", classify=" + classify + ", teaUser=" + teaUser + ", cName=" + cName
				+ ", isPay=" + isPay + ", signNum=" + signNum + ", introduceImg=" + introduceImg + ", status=" + status
				+ "]";
	}
	public Curriculum(Integer cId, Classify classify, TeaUser teaUser, String cName, int isPay, int signNum,
			String introduceImg, String status) {
		this.cId = cId;
		this.classify = classify;
		this.teaUser = teaUser;
		this.cName = cName;
		this.isPay = isPay;
		this.signNum = signNum;
		this.introduceImg = introduceImg;
		this.status = status;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
