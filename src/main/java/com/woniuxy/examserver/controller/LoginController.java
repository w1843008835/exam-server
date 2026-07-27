package com.woniuxy.examserver.controller;

import com.woniuxy.examserver.dto.LoginRequest;
import com.woniuxy.examserver.dto.R;
import com.woniuxy.examserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class LoginController {
    private final UserService userService;

    @PostMapping("/login")
    public R login(@RequestBody LoginRequest loginRequest) {
        return new R(userService.login(loginRequest));
    }
}
