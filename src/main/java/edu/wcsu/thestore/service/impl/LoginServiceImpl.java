package edu.wcsu.thestore.service.impl;

import edu.wcsu.thestore.dao.LoginDao;
import edu.wcsu.thestore.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.Optional;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public boolean login(String email, String password) {
        Specification specification = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path p_email = root.get("email");
                Path p_password = root.get("password");

                Predicate p1 = criteriaBuilder.equal(p_email, email);
                Predicate p2 = criteriaBuilder.equal(p_password, password);
                Predicate predicate = criteriaBuilder.and(p1, p2);
                return predicate;
            }
        };
        return loginDao.count(specification) == 1;
    }

    @Override
    public Optional getUserName(String email) {
        Specification specification = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path p_email = root.get("email");

                Predicate p1 = criteriaBuilder.equal(p_email, email);
                return p1;
            }
        };

        return loginDao.findOne(specification);
    }

    @Override
    public Optional findUserById(Long id) {
        Specification specification = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path p_id = root.get("userID");

                Predicate p1 = criteriaBuilder.equal(p_id, id);
                return p1;
            }
        };
        return loginDao.findOne(specification);
    }
}
