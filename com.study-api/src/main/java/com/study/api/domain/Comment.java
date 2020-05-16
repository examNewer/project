/**
 * 
 */
package com.study.api.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author 黄达
 *
 * 2020年5月3日
 */
//评论表
@Table(name = "Comment")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer cid;
	@Column(name = "stu_id")
	private Integer stuId;
	private StuUser stuUser;
	private String content;
	private Integer star;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date time;
	private Integer Status;
	public Comment(Integer id, Integer cid, Integer stuId, StuUser stuUser, String content, Integer star, Date time,
			Integer status) {
		super();
		this.id = id;
		this.cid = cid;
		this.stuId = stuId;
		this.stuUser = stuUser;
		this.content = content;
		this.star = star;
		this.time = time;
		Status = status;
	}
	/**
	 * 
	 */
	public Comment() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public StuUser getStuUser() {
		return stuUser;
	}
	public void setStuUser(StuUser stuUser) {
		this.stuUser = stuUser;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getStar() {
		return star;
	}
	public void setStar(Integer star) {
		this.star = star;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", cid=" + cid + ", stuId=" + stuId + ", stuUser=" + stuUser + ", content="
				+ content + ", star=" + star + ", time=" + time + ", Status=" + Status + "]";
	}
	
}
