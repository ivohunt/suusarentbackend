package com.suusarent.suusarentback.controller.login.dto;

import lombok.Data;

@Data
public class LoginResponse {
    private Integer userId;
    private String roleName;
    private String token;

//    public LoginResponse(String token, String email, String roleName) {
//        this.token = token;
//        this.email =
//
//    }

}
