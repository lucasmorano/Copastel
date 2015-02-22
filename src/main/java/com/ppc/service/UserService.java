package com.ppc.service;

import com.ppc.document.User;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by lucasmorano on 2/21/15.
 */
public interface UserService extends GenericService<User> {

    UserDetails findUserByLogin(String login);
}
