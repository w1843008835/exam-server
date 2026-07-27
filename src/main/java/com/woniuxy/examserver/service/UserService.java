package com.woniuxy.examserver.service;

import com.woniuxy.examserver.dto.LoginRequest;
import com.woniuxy.examserver.dto.LoginResponse;
import com.woniuxy.examserver.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author admin
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2026-07-25 16:14:33
*/
public interface UserService extends IService<User> {

    LoginResponse login(LoginRequest loginRequest);
}
