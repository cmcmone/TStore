package edu.wcsu.thestore.service;

import edu.wcsu.thestore.domain.OrderLine;

import java.util.List;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface OrderLineService {
    void saveOrderLine(OrderLine orderLine);
    List findOrderLineByOrderID(Long id);
}
