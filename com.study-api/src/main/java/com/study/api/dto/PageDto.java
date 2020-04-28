/**   
* @Title: PageDto.java 
* @Package com.study.api.dto 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）  
* @date 2020年4月27日 下午5:27:14 
* @version V1.0   
*/
package com.study.api.dto;

/** 
* @ClassName: PageDto 
* @Description: 分页类
* @author (作者)  
* @date 2020年4月27日 下午5:27:14 
* @version V1.0 
*/
public class PageDto {
	private Integer page=1;
	private Integer pageSize=3;

	public Integer getPage() {
		if(page<1) page=1;
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
