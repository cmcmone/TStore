package edu.wcsu.thestore.service.impl;

import edu.wcsu.thestore.dao.ProductsDao;
import edu.wcsu.thestore.domain.Product;
import edu.wcsu.thestore.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
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


    @Override
    public List<Product> findProductByCatagory(String category) {

        Specification specification = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path p_category = root.get("category");

                Predicate p1 = criteriaBuilder.like(p_category,"%"+category+"%");
                return p1;
            }
        };

        return productsDao.findAll(specification);

    }

    @Override
    public List<Product> findProductByCatagoryAndVendor(String category,String vendor) {

        Specification specification = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path p_category = root.get("category");
                Path p_vendor = root.get("vendorName");
                Predicate p1 = criteriaBuilder.like(p_category,"%"+category+"%");
                Predicate p2 = criteriaBuilder.equal(p_vendor,vendor);
                Predicate predicate = criteriaBuilder.and(p1,p2);
                return predicate;
            }
        };

        return productsDao.findAll(specification);

    }

    @Override
    public List<Product> findProductByVendor(String vendor) {

        Specification specification = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path p_vendor = root.get("vendorName");

                Predicate p1 = criteriaBuilder.equal(p_vendor,vendor);

                return p1;
            }
        };

        return productsDao.findAll(specification);

    }

    @Override
    public List<Product> searchForProduct(String search) {

        Specification specification = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path p_name = root.get("productName");

                Predicate p1 = criteriaBuilder.like(p_name,"%"+search+"%");

                return p1;
            }
        };

        return productsDao.findAll(specification);

    }

}
