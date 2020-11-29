package edu.wcsu.thestore.service;

import edu.wcsu.thestore.domain.User;

import java.util.Optional;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface LoginService {
    boolean login(String email, String password);
    Optional getUserName(String email);
    Optional<User> findUserById(Long id);
}
