package com.study.api.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//分类
@Table(name = "Exercises_classify")
public class Classify {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ce_id")
	private Integer id;//分类编号
	@Column(name = "ce_name")
	private String name;//分类名字
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Classify(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Classify [id=" + id + ", name=" + name + "]";
	}
	
	public Classify() {
		// TODO Auto-generated constructor stub
	}
	
	
}
