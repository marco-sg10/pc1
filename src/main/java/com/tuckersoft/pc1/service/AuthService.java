package com.tuckersoft.pc1.service;

import com.tuckersoft.pc1.dto.response.UserResponseDto;

public class AuthService {
    private final AccountService accountService;

    public AuthService(AccountService accountService) {
        this.accountService = accountService;
    }

    public UserResponseDto login(String username, String password) {
        return accountService.getUserByUsername(username);
    }

    public UserResponseDto logout(String username) {
        return accountService.getUserByUsername(username);
    }
}
