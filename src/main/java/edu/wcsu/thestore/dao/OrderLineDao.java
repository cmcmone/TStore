package edu.wcsu.thestore.dao;

import edu.wcsu.thestore.domain.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface OrderLineDao extends JpaRepository<OrderLine, Long>, JpaSpecificationExecutor<OrderLine> {

    @Query(value = "select * from t_order_line a inner join t_product b on a.product_id = b.id where a.orderid = :orderID", nativeQuery = true)
    List<OrderLine> findAllCart(@Param("orderID") Long orderID);

}
