package com.ppc.repo;

import com.ppc.document.User;

/**
 * Created by lucasmorano on 2/22/15.
 */
public interface UserRepository extends GenericRepository<User> {

    User findUserByLogin(String login);
}
