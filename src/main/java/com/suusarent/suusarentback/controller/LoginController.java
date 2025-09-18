package com.suusarent.suusarentback.controller;

import com.suusarent.suusarentback.presistence.user.UserInfo;
import com.suusarent.suusarentback.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @GetMapping("/login")
    public LoginResponse login(@RequestParam String email, @RequestParam String password) {
        return loginService.login(email, password);
    }
}
