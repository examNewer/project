package com.study.api.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//课程
@Table(name = "curriculum")
public class Curriculum {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cid")
	private Integer cId;//课程编号
	@Column(name = "ce_id")
	private Integer ceId;//类别Id
	private Integer tId;//教师id
	private Classify classify;//类别
	private TeaUser teaUser;//教师用户
	@Column(name = "cname")
	private String cName;//课程名字
	@Column(name = "is_pay")
	private Integer isPay;//是否需要会员
	@Column(name = "sign_num")
	private int signNum;//报名数
	@Column(name = "introduce_img")
	private String introduceImg;//课程图
	private String status;//状态
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public Integer getCeId() {
		return ceId;
	}
	public void setCeId(Integer ceId) {
		this.ceId = ceId;
	}
	public Integer gettId() {
		return tId;
	}
	public void settId(Integer tId) {
		this.tId = tId;
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
	public Integer getIsPay() {
		return isPay;
	}
	public void setIsPay(Integer isPay) {
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
	
	
	/**
	 * 
	 */
	public Curriculum() {
		// TODO Auto-generated constructor stub
	}
	
	public Curriculum(Integer cId, Integer ceId, Integer tId, Classify classify, TeaUser teaUser, String cName,
			Integer isPay, int signNum, String introduceImg, String status) {
		super();
		this.cId = cId;
		this.ceId = ceId;
		this.tId = tId;
		this.classify = classify;
		this.teaUser = teaUser;
		this.cName = cName;
		this.isPay = isPay;
		this.signNum = signNum;
		this.introduceImg = introduceImg;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Curriculum [cId=" + cId + ", ceId=" + ceId + ", tId=" + tId + ", classify=" + classify
				+ ", teaUser=" + teaUser + ", cName=" + cName + ", isPay=" + isPay + ", signNum=" + signNum
				+ ", introduceImg=" + introduceImg + ", status=" + status + "]";
	}
	
}
