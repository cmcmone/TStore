package edu.wcsu.thestore.dao;

import edu.wcsu.thestore.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface ProductsDao extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
}
