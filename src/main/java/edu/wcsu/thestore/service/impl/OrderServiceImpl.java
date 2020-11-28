package edu.wcsu.thestore.service.impl;

import edu.wcsu.thestore.dao.OrderDao;
import edu.wcsu.thestore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.List;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public List findMyOrder(Long userID) {
        Specification specification = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path p_userID = root.get("userID");

                Predicate p1 = criteriaBuilder.equal(p_userID, userID);
                return p1;
            }
        };

        return orderDao.findAll(specification);
    }
}
