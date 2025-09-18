package com.suusarent.suusarentback.controller;

import lombok.Data;

@Data
public class LoginResponse {
    private String email;
    private String password;
    private String status;
}
