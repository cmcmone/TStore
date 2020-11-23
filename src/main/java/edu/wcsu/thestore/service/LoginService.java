package edu.wcsu.thestore.service;

import org.springframework.stereotype.Service;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface LoginService {
    boolean login(String email, String password);
}
