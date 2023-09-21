package com.winniewang.springbootmall.service;

import com.winniewang.springbootmall.dto.CreateOrderRequest;
import com.winniewang.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
