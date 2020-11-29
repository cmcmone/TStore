package edu.wcsu.thestore.service.impl;

import edu.wcsu.thestore.dao.ProductsDao;
import edu.wcsu.thestore.domain.Product;
import edu.wcsu.thestore.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    private ProductsDao productsDao;

    @Override
    public void save(Product product) {
        productsDao.save(product);
    }

    @Override
    public long numberOfProducts() {
        return productsDao.count();
    }

    @Override
    public List<Product> findAllProducts() {
        return productsDao.findAll();
    }

    @Override
    public Optional<Product> findProductByID(long id) {
        return productsDao.findById(id);
    }
}
