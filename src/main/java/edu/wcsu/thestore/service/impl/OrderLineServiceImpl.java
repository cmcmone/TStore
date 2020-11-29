package edu.wcsu.thestore.service.impl;

import edu.wcsu.thestore.dao.OrderLineDao;
import edu.wcsu.thestore.domain.OrderLine;
import edu.wcsu.thestore.service.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
