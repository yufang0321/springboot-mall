package com.winniewang.springbootmall.service;

import com.winniewang.springbootmall.dto.ProductRequest;
import com.winniewang.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
