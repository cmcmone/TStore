package edu.wcsu.thestore.service.impl;

import edu.wcsu.thestore.dao.CartDao;
import edu.wcsu.thestore.domain.ShoppingCart;
import edu.wcsu.thestore.service.CartService;
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
public class CartServiceImpl implements CartService {
    @Autowired
    private CartDao cartDao;

    @Override
    public List getMyShoppingCart(Long userID) {
        Specification specification = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Path p_userID = root.get("userID");

                Predicate p1 = criteriaBuilder.equal(p_userID, userID);
                return p1;
            }
        };

        return cartDao.findAll(specification);
    }

    @Override
    public List findShoppingCartByUserID(Long userID) {
        return cartDao.findAllCart(userID);
    }

    @Override
    public void delShoppingCartByID(Long id) {
        cartDao.deleteById(id);
    }

    @Override
    public Optional<ShoppingCart> findShoppingCartByID(Long id) {
        return cartDao.findById(id);
    }

    @Override
    public void updateShoppingCart(ShoppingCart cart) {
        cartDao.save(cart);
    }
}
