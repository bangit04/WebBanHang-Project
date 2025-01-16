package com.bang.WebBanHang_Project.service;

import com.bang.WebBanHang_Project.controller.request.SignInRequest;
import com.bang.WebBanHang_Project.controller.response.TokenResponse;

public interface AuthenticationService {
    TokenResponse getAccessToken(SignInRequest request);

    TokenResponse getRefreshToken(String request);
}
