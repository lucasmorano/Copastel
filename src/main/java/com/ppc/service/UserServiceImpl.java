package com.ppc.service;

import com.ppc.document.User;
import com.ppc.dto.UserLogin;
import com.ppc.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Created by lucasmorano on 2/21/15.
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User> implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails findUserByLogin(String login) throws UsernameNotFoundException {
        User user = userRepository.findUserByLogin(login);
        if (user == null) {
            throw new UsernameNotFoundException("Check your credentials");
        }
        return new UserLogin(user.getLogin(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
    }

    @Override
    public User create(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return super.create(user);
    }
}
