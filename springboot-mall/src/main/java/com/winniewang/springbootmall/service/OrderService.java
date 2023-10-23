package com.winniewang.springbootmall.service;

import com.winniewang.springbootmall.dto.CreateOrderRequest;
import com.winniewang.springbootmall.dto.OrderQueryParams;
import com.winniewang.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);
}
