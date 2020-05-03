package com.study.student.dto;

public class PageDto {
	private Integer page = 1;
	private Integer pageSize =3;

	public Integer getPage() {
		if(this.page<1) this.page=1;
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
