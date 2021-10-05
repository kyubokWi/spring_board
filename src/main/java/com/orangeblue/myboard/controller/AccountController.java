package com.orangeblue.myboard.controller;

import com.orangeblue.myboard.domain.RoleEnum;
import com.orangeblue.myboard.domain.User;
import com.orangeblue.myboard.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/account")
public class AccountController {
    
    private final UserService userService;

    @GetMapping("/login")
    public String login() {
        return "account/login";
    }

    @PostMapping("/register")
    public String register(User user, RoleEnum roleEnum) {
        userService.userSave(user, roleEnum);
        return "account/login";
    }
}
