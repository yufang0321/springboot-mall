package com.winniewang.springbootmall.dao;

import com.winniewang.springbootmall.dto.ProductRequest;
import com.winniewang.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct (Integer productId, ProductRequest productRequest);
}
