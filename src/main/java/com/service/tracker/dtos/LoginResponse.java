package com.service.tracker.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {
    private String token;

    private long expiresIn;

    public String getToken() {
        return token;
    }
}