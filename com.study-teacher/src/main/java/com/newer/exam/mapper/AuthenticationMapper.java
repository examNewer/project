package com.newer.exam.mapper;

import com.newer.exam.domain.Authentication;

public interface AuthenticationMapper {
    int deleteByPrimaryKey(Integer authenticationId);

    int insert(Authentication record);

    int insertSelective(Authentication record);

    Authentication selectByPrimaryKey(Integer authenticationId);

    int updateByPrimaryKeySelective(Authentication record);

    int updateByPrimaryKey(Authentication record);
}