package com.study.sysadmin.domain;

import com.study.api.domain.Curriculum;

//广告
public class Advertising {
	private Integer advertisingId;//广告编号
	private Curriculum curriculum;//课程
	private String  advertisingImg;//广告图片
	private String advertisingDescribe;//广告描述
	private int isC;//是否上推荐页

	public Integer getAdvertisingId() {
		return advertisingId;
	}
	public void setAdvertisingId(Integer advertisingId) {
		this.advertisingId = advertisingId;
	}
	public Curriculum getCurriculum() {
		return curriculum;
	}
	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}
	public String getAdvertisingImg() {
		return advertisingImg;
	}
	public void setAdvertisingImg(String advertisingImg) {
		this.advertisingImg = advertisingImg;
	}
	public String getAdvertisingDescribe() {
		return advertisingDescribe;
	}
	public void setAdvertisingDescribe(String advertisingDescribe) {
		this.advertisingDescribe = advertisingDescribe;
	}
	public int getIsC() {
		return isC;
	}
	public void setIsC(int isC) {
		this.isC = isC;
	}
	@Override
	public String toString() {
		return "Advertising [advertisingId=" + advertisingId + ", curriculum=" + curriculum + ", advertisingImg="
				+ advertisingImg + ", advertisingDescribe=" + advertisingDescribe + ", isC=" + isC + "]";
	}
	
	public Advertising() {
		// TODO Auto-generated constructor stub
	}
	public Advertising(Integer advertisingId, Curriculum curriculum, String advertisingImg, String advertisingDescribe,
			int isC) {
		this.advertisingId = advertisingId;
		this.curriculum = curriculum;
		this.advertisingImg = advertisingImg;
		this.advertisingDescribe = advertisingDescribe;
		this.isC = isC;
	}
	
	
	
	
}
