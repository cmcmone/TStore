package edu.wcsu.thestore.service.impl;

import edu.wcsu.thestore.dao.LoginDao;
import edu.wcsu.thestore.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;

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
}
