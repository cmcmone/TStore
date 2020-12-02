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
    List<Product> findProductByCatagory(String catagory);
    List<Product> findProductByCatagoryAndVendor(String catagory,String vendor);
    List<Product> findProductByVendor(String vendor);
    List<Product> searchForProduct(String search);
    void save(Product product);
}
