package com.ppc.repo;

import com.ppc.document.User;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by lucasmorano on 2/21/15.
 */
@Repository
public class UserRepositoryImpl extends GenericRepositoryImpl<User> implements UserRepository {

    private static final String LOGIN = "login";

    @Override
    public Class<User> getType() {
        return User.class;
    }

    public User findUserByLogin(String login) {
        Query query = Query.query(Criteria.where(LOGIN).is(login));
        return mongoTemplate.findOne(query, getType());
    }
}
