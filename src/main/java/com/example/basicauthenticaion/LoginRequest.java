package com.example.basicauthenticaion;

import lombok.Data;

@Data
public class LoginRequest {
    private Long userName;
    private String password;
}
