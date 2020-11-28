package edu.wcsu.thestore.dao;

import edu.wcsu.thestore.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface OrderDao extends JpaRepository<Order, Long>, JpaSpecificationExecutor<Order> {
}
