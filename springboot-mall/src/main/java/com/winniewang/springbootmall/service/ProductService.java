package com.winniewang.springbootmall.service;

import com.winniewang.springbootmall.constant.ProductCategory;
import com.winniewang.springbootmall.dao.ProductQueryParams;
import com.winniewang.springbootmall.dto.ProductRequest;
import com.winniewang.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

    Integer countProduct(ProductQueryParams productQueryParams);

}
