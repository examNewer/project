package com.study.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//学生用户
@Table(name = "stu_user")
public class StuUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stu_id")
	private Integer stuId;//学生编号
	@Column(name = "username")
	private String userName;//用户名
	private String pwd;//密码
	@Column(name = "headimg")
	private String headImg;//头像
	private String sex;//性别
	@Column(name = "is_member")
	private Integer isMember;//是否是会员
	@Column(name = "member_end_time")
	private Date memberEndTime;//会员到期时间
	@Column(name = "weChat_id")
	private Integer weChatId;//微信编号
	private int Status;//状态
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	public Integer getIsMember() {
		return isMember;
	}
	public void setIsMember(Integer isMember) {
		this.isMember = isMember;
	}
	public Date getMemberEndTime() {
		return memberEndTime;
	}
	public void setMemberEndTime(Date memberEndTime) {
		this.memberEndTime = memberEndTime;
	}
	public Integer getWeChatId() {
		return weChatId;
	}
	public void setWeChatId(Integer weChatId) {
		this.weChatId = weChatId;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "StuUser [stuId=" + stuId + ", userName=" + userName + ", pwd=" + pwd + ", headImg=" + headImg + ", sex="
				+ sex + ", isMember=" + isMember + ", memberEndTime=" + memberEndTime + ", weChatId=" + weChatId
				+ ", Status=" + Status + "]";
	}
	
	
	public StuUser() {
		// TODO Auto-generated constructor stub
	}
	public StuUser(Integer stuId, String userName, String pwd, String headImg, String sex, Integer isMember,
			Date memberEndTime, Integer weChatId, int status) {
		this.stuId = stuId;
		this.userName = userName;
		this.pwd = pwd;
		this.headImg = headImg;
		this.sex = sex;
		this.isMember = isMember;
		this.memberEndTime = memberEndTime;
		this.weChatId = weChatId;
		Status = status;
	}
	
	
}
