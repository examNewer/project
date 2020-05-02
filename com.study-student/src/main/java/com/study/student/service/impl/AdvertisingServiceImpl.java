/**
 * 
 */
package com.study.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.api.domain.Advertising;
import com.study.student.dao.AdvertisingMapper;
import com.study.student.service.AdvertisingService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

/**
 * @author 黄达
 *
 * 2020年5月1日
 */
@Service
public class AdvertisingServiceImpl implements AdvertisingService{
	@Autowired
	private AdvertisingMapper advertisingMapper;
	@Override
	public List<Advertising> findIsC() {
		Example example=new Example(Advertising.class);
		Criteria criteria=example.createCriteria();
		criteria.andEqualTo("isC", 1);
		return advertisingMapper.selectByExample(example);
	}

}
