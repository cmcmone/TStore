package edu.wcsu.thestore.service;

import edu.wcsu.thestore.domain.ShoppingCart;

import java.util.List;
import java.util.Optional;

/**
 * @author Ray Chen
 * @version 1.0
 */
public interface CartService {
    List getMyShoppingCart(Long userID);
    List findShoppingCartByUserID(Long userID);
    void delShoppingCartByID(Long id);
    Optional<ShoppingCart> findShoppingCartByID(Long id);
    void updateShoppingCart(ShoppingCart cart);
}
