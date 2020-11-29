package edu.wcsu.thestore.service;

import edu.wcsu.thestore.domain.Order;

import java.util.List;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface OrderService {
    List findMyOrder(Long userID);
    Order save(Order order);
}
