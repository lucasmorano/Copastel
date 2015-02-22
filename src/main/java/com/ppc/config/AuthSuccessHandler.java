package com.ppc.config;

import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class AuthSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

}