package com.system.ronitEcommerce.service;

import com.system.ronitEcommerce.entity.ProductCart;
import com.system.ronitEcommerce.pojo.ProductCartPojo;

import java.util.List;

public interface ProductCartService {
    List<ProductCart> fetchAll();

    ProductCartPojo save(ProductCartPojo productCartPojo);

    ProductCart fetchOne(Integer id);

    void deleteFromCart(Integer id);

    String updateQuantity(ProductCart productCart);

    List<ProductCart> fetchAll(Integer id);
}
