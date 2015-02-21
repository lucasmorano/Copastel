package com.ppc.repo;

import com.ppc.document.User;
import org.springframework.stereotype.Repository;

/**
 * Created by lucasmorano on 2/21/15.
 */
@Repository
public class UserRepository extends GenericRepositoryImpl<User> implements GenericRepository<User> {

    @Override
    public Class getClazz() {
        return User.class;
    }

}
