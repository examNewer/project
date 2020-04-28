package com.study.sysadmin.dto;

import com.study.api.dto.PageDto;

public class UserDto extends PageDto {
	private String name;
	private Integer id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

}
