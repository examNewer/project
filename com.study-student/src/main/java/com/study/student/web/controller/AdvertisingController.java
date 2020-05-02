/**
 * 
 */
package com.study.student.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.api.domain.Advertising;
import com.study.student.service.AdvertisingService;

/**
 * @author 黄达
 *
 * 2020年5月1日
 */
@RestController
public class AdvertisingController {
	@Autowired
	private AdvertisingService advertisingService;
	@RequestMapping(value = "findIsC")
	public List<Advertising> findIsC() {
		return this.advertisingService.findIsC();
	}
}
