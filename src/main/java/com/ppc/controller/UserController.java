package com.ppc.controller;

import com.ppc.document.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* Created by lucasmorano on 2/21/15.
*/
@RequestMapping("/User")
@Controller
public class UserController extends GenericController<User> {

}
