package edu.wcsu.thestore.service.impl;

import edu.wcsu.thestore.domain.User;
import edu.wcsu.thestore.repository.UserDao;
import edu.wcsu.thestore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ray Chen
 * @version 1.0
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
