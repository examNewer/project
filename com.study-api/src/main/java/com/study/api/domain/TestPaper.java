/**
 * 
 */
package com.study.api.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 黄达
 *
 * 2020年5月7日
 */
@Table(name = "Test_Paper")
//试卷从表
public class TestPaper {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;//（主键）从表编号	
	private Integer eid;//（外键）试卷编号
	private String ename;//试题名称
	private String type;//试题分类（单选，多选）
	private String answer;//正确答案
	private String option1;//选项1
	private String option2;//选项2
	private String option3;//选项3
	private String option4;//选项4
	private String comment;//解析
	private Integer difficulty;//题目难度
	private Integer point;//题目分数
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
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
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public TestPaper(Integer id, Integer eid, String ename, String type, String answer, String option1, String option2,
			String option3, String option4, String comment, Integer difficulty, Integer point) {
		super();
		this.id = id;
		this.eid = eid;
		this.ename = ename;
		this.type = type;
		this.answer = answer;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.comment = comment;
		this.difficulty = difficulty;
		this.point = point;
	}
	
	/**
	 * 
	 */
	public TestPaper() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TestPaper [id=" + id + ", eid=" + eid + ", ename=" + ename + ", type=" + type + ", answer=" + answer
				+ ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4
				+ ", comment=" + comment + ", difficulty=" + difficulty + ", point=" + point + "]";
	}
	
}
