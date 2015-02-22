package com.ppc.context;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 * Created by lucasmorano on 2/22/15.
 */
@Component
public class Context {

    public UserDetails getLoggedUser(){
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
