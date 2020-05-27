package com.newer.exam.services;

import com.newer.exam.domain.Teacher;

public interface TeacherService extends BaseService<Teacher> {
	/**
     * getUserByUserName
     *登录
     * @param username username
     * @param pwd      pwd
     * @return Teacher
     */
	Teacher getTeacherByUsernamePwd(String UaserName,String Pwd);
}
