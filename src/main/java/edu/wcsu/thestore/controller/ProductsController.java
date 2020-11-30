package edu.wcsu.thestore.controller;

import edu.wcsu.thestore.domain.Product;
import edu.wcsu.thestore.domain.User;
import edu.wcsu.thestore.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

/**
 * @author Ray Chen
 * @version 1.0
 */
@Controller
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @RequestMapping("/")
    public String showAllProducts(Model model) {
        long count = productsService.numberOfProducts();
        model.addAttribute("count", count);
        if (count > 0) {
            List<Product> allProducts = productsService.findAllProducts();
            model.addAttribute("allProducts", allProducts);
        }
        return "index";
    }

    @RequestMapping("/product")
    public String showProductDetail(@RequestParam("id") Long productID,
                                    Model model) {
        Optional<Product> optional = productsService.findProductByID(productID);
        if (optional.isPresent()) {
            Product product = optional.get();
            model.addAttribute("product", product);
        }
        return "details";
    }


    @RequestMapping("/products")
    public String showProductsByCatagory(@RequestParam("category") String productCategory,
                                         @RequestParam("vendor") String productVendor,
                                         Model model) {

        if(productCategory.isEmpty() && productVendor.isEmpty()){
            List<Product> allProducts = productsService.findAllProducts();
            model.addAttribute("products", allProducts);
        }
        else if(productVendor.isEmpty()){
            List<Product> catagorizedProducts = productsService.findProductByCatagory(productCategory);
            model.addAttribute("products", catagorizedProducts);
        }
        else{
            List<Product> catagorizedProducts = productsService.findProductByCatagoryAndVendor(productCategory,productVendor);
            model.addAttribute("products", catagorizedProducts);
        }
        System.out.println(productCategory);
        System.out.println(productVendor);
        return "products";
    }



}
