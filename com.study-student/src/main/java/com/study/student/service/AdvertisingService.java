/**
 * 
 */
package com.study.student.service;

import java.util.List;

import com.study.api.domain.Advertising;

/**
 * @author 黄达
 *
 * 2020年5月1日
 */
public interface AdvertisingService {
	/**
	 * 查询上广告页的广告信息
	 * @return
	 */
	public List<Advertising> findIsC();

}
