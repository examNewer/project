/**
 * 
 */
package com.study.student.dto;

/**
 * @author 黄达
 *
 * 2020年5月3日
 */
public class CurriculumDto {
	private Integer ceId;
	private Integer isPay;
	public Integer getCeId() {
		return ceId;
	}
	public void setCeId(Integer ceId) {
		this.ceId = ceId;
	}
	public Integer getIsPay() {
		return isPay;
	}
	public void setIsPay(Integer isPay) {
		this.isPay = isPay;
	}
	/**
	 * 
	 */
	public CurriculumDto() {
		// TODO Auto-generated constructor stub
	}
	public CurriculumDto(Integer ceId, Integer isPay) {
		super();
		this.ceId = ceId;
		this.isPay = isPay;
	}
	

}
