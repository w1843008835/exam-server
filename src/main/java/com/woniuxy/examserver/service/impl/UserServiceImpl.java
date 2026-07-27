package com.woniuxy.examserver.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxy.examserver.dto.LoginRequest;
import com.woniuxy.examserver.dto.LoginResponse;
import com.woniuxy.examserver.entity.User;
import com.woniuxy.examserver.service.UserService;
import com.woniuxy.examserver.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2026-07-25 16:14:33
*/
@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    private final PasswordEncoder passwordEncoder;
    @Override
    public LoginResponse login(LoginRequest loginRequest) {

        User user = getOne(Wrappers.lambdaQuery(User.class)
                .eq(User::getUserName, loginRequest.getUsername())
        );

        if(user != null && passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())){

        return new LoginResponse(user.getId(),user.getUserName(),"");
        }
        return null;
    }
}




