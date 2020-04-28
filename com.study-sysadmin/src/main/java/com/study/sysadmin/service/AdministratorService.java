package com.study.sysadmin.service;

import org.springframework.stereotype.Service;

import com.study.sysadmin.domain.Administrator;

public interface AdministratorService {

public Administrator login(String adminName,String adminPwd);
}
