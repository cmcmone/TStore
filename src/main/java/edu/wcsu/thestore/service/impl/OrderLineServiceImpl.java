package edu.wcsu.thestore.service.impl;

import edu.wcsu.thestore.dao.OrderLineDao;
import edu.wcsu.thestore.domain.OrderLine;
import edu.wcsu.thestore.service.OrderLineService;
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
public class OrderLineServiceImpl implements OrderLineService {
    @Autowired
    private OrderLineDao orderLineDao;

    @Override
    public void saveOrderLine(OrderLine orderLine) {
        orderLineDao.save(orderLine);
    }

    @Override
    public List findOrderLineByOrderID(Long orderID) {
        Specification specification = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path p_orderID = root.get("orderID");

                Predicate p1 = criteriaBuilder.equal(p_orderID, orderID);
                return p1;
            }
        };
        return orderLineDao.findAll(specification);
    }
}
