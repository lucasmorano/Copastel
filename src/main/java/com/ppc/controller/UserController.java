package com.ppc.controller;

import com.ppc.document.User;
import com.ppc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* Created by lucasmorano on 2/21/15.
*/
@RequestMapping("/User")
@Controller
public class UserController  {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public User create(User user){
        return userService.create(new User());
    }
}
