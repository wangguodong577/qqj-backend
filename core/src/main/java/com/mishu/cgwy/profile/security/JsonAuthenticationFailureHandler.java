package com.mishu.cgwy.profile.security;

import com.mishu.cgwy.error.ErrorCode;
import com.mishu.cgwy.error.RestError;
import com.mishu.cgwy.utils.RenderUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JsonAuthenticationFailureHandler implements
        AuthenticationFailureHandler{

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        final RestError data = new RestError();

        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        data.setErrno(ErrorCode.BadCredential.getError());
        data.setErrmsg(ErrorCode.BadCredential.getErrorMessage());
        RenderUtils.renderJson(response, data);
    }
}