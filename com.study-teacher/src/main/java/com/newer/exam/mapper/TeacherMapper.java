package com.newer.exam.mapper;

import org.apache.ibatis.annotations.Param;

import com.newer.exam.domain.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
    Teacher getTeacherByUserNamePwd(@Param("username")String UserName,@Param("pwd")String Pwd);

}