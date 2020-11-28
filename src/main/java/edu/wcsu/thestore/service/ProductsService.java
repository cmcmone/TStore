package edu.wcsu.thestore.service;

import edu.wcsu.thestore.domain.Product;

import java.util.List;
import java.util.Optional;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface ProductsService {
    long numberOfProducts();
    List<Product> findAllProducts();
    Optional<Product> findProductByID(long id);
}