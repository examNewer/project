package com.study.api.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 黄达
 *
 * 2020年5月1日
 */
@Table(name = "advertising")
public class Advertising {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer advertisingId;
	private int cid;
	private String advertisingImg;
	private String advertisingDescribe;
	@Column(name = "is_c")
	private int isC;
	
	public Integer getAdvertisingId() {
		return advertisingId;
	}
	public void setAdvertisingId(Integer advertisingId) {
		this.advertisingId = advertisingId;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	

	public Advertising() {
		// TODO Auto-generated constructor stub
	}
	public Advertising(Integer advertisingId, int cid, String advertisingImg, String advertisingDescribe, int isC) {
		super();
		this.advertisingId = advertisingId;
		this.cid = cid;
		this.advertisingImg = advertisingImg;
		this.advertisingDescribe = advertisingDescribe;
		this.isC = isC;
	}
	@Override
	public String toString() {
		return "Advertising [advertisingId=" + advertisingId + ", cid=" + cid + ", advertisingImg=" + advertisingImg
				+ ", advertisingDescribe=" + advertisingDescribe + ", isC=" + isC + "]";
	}
	
}
