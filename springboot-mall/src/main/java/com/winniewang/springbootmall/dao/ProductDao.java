package com.winniewang.springbootmall.dao;

import com.winniewang.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
