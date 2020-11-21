package edu.wcsu.thestore.service;

import edu.wcsu.thestore.domain.User;

import java.util.List;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface UserService {
    List<User> findAllUser();
    void insertUser(User user);
}
