/**
 * 
 */
package com.study.api.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 黄达
 *
 * 2020年5月5日
 */
//试题表
@Table(name = "Exercises")
public class Exercises {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;//编号
	@Column(name = "ce_id")
	private Integer ceId;//（外键）分类编号
	private Integer tid;//（外键）老师编号
	private String ename;//题目
	private String type;//类型
	private String answer;//正确答案
	private String option1;//选项1
	private String option2;//选项2
	private String option3;//选项3
	private String option4;//选项4
	private String comment;//解析
	private Integer difficulty;//难道等级
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCeId() {
		return ceId;
	}
	public void setCeId(Integer ceId) {
		this.ceId = ceId;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}
	
	/**
	 * 
	 */
	public Exercises() {
		// TODO Auto-generated constructor stub
	}
	public Exercises(Integer id, Integer ceId, Integer tid, String ename, String type, String answer, String option1,
			String option2, String option3, String option4, String comment, Integer difficulty) {
		super();
		this.id = id;
		this.ceId = ceId;
		this.tid = tid;
		this.ename = ename;
		this.type = type;
		this.answer = answer;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.comment = comment;
		this.difficulty = difficulty;
	}
	@Override
	public String toString() {
		return "Exercises [id=" + id + ", ce_id=" + ceId + ", tid=" + tid + ", ename=" + ename + ", type=" + type
				+ ", answer=" + answer + ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3
				+ ", option4=" + option4 + ", comment=" + comment + ", difficulty=" + difficulty + "]";
	}
	
}
