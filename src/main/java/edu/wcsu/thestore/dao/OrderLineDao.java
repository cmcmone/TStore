package edu.wcsu.thestore.dao;

import edu.wcsu.thestore.domain.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface OrderLineDao extends JpaRepository<OrderLine, Long>, JpaSpecificationExecutor<OrderLine> {
}
