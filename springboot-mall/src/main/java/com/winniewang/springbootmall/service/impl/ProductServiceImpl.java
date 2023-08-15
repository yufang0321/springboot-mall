package com.winniewang.springbootmall.service.impl;

import com.winniewang.springbootmall.dao.ProductDao;
import com.winniewang.springbootmall.model.Product;
import com.winniewang.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}