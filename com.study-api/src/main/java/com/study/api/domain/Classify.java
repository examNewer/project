package com.study.api.domain;

//分类
public class Classify {
	private Integer id;//分类编号
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
