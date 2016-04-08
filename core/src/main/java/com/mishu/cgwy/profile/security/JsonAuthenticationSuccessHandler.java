package com.mishu.cgwy.profile.security;

import com.mishu.cgwy.profile.facade.CustomerFacade;
import com.mishu.cgwy.utils.RenderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JsonAuthenticationSuccessHandler implements
        AuthenticationSuccessHandler {

    @Autowired
    private CustomerFacade customerFacade;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {
        if (authentication != null) {
            RenderUtils.renderJson(response, customerFacade.findCustomerWrapperByUsername(authentication.getName()));
        }
    }

}