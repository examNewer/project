/**
 * 
 */
package com.study.api.domain;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author 黄达
 *
 * 2020年5月5日
 */
//试卷表
@Table(name = "Exam")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;//编号
	private Integer tid;//教师编号
	@DateTimeFormat(style = "yy-MM-dd")
	@Column(name = "begin_time")
	private Date beginTime;//开始时间
	@DateTimeFormat(style = "yy-MM-dd")
	@Column(name = "end_time")
	private Date endTime;//结束时间
	@DateTimeFormat(style = "yy-MM-dd")
	@Column(name = "create_time")
	private Date createTime;//创建时间
	@Column(name = "exam_code")
	private String examCode;//考场代码
	@Column(name = "exam_time")
	private double examTime;//考试时长
	private List<TestPaper> testPaper;//该考试所有试题
	
	public double getExamTime() {
		return examTime;
	}
	public void setExamTime(double examTime) {
		this.examTime = examTime;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getExamCode() {
		return examCode;
	}
	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}
	public List<TestPaper> getTestPaper() {
		return testPaper;
	}
	public void setTestPaper(List<TestPaper> testPaper) {
		this.testPaper = testPaper;
	}
	
	
	public Exam(Integer eid, Integer tid, Date beginTime, Date endTime, Date createTime, String examCode,
			double examTime, List<TestPaper> testPaper) {
		super();
		this.eid = eid;
		this.tid = tid;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.createTime = createTime;
		this.examCode = examCode;
		this.examTime = examTime;
		this.testPaper = testPaper;
	}
	/**
	 * 
	 */
	public Exam() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Exam [eid=" + eid + ", tid=" + tid + ", beginTime=" + beginTime + ", endTime=" + endTime
				+ ", createTime=" + createTime + ", examCode=" + examCode + ", examTime=" + examTime + ", testPaper="
				+ testPaper + "]";
	}
	
	
	
}
