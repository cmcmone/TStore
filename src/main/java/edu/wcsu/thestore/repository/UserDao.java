package edu.wcsu.thestore.repository;

import edu.wcsu.thestore.domain.User;

import java.util.List;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface UserDao {
    List<User> findAllUser();
}
