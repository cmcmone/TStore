package edu.wcsu.thestore.dao;

import edu.wcsu.thestore.domain.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface CartDao extends JpaRepository<ShoppingCart, Long>, JpaSpecificationExecutor<ShoppingCart> {

    @Query(value = "select * from t_shopping_cart a inner join t_product b on a.product_id = b.id where a.userid = :userID", nativeQuery = true)
    List<ShoppingCart> findAllCart(@Param("userID") Long userID);
}
