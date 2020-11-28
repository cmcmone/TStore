package edu.wcsu.thestore.service.impl;

import edu.wcsu.thestore.dao.RegisterDao;
import edu.wcsu.thestore.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import edu.wcsu.thestore.domain.User;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.criteria.*;

//Jack Baxter

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterDao registerDao;

    @Override
    public boolean register(User user) {
        try {
            registerDao.save(user);
        }
        catch(Exception e) {
            return false;
        }
        return true;
    }
}