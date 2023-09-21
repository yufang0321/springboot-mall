package com.winniewang.springbootmall.dao;

import com.winniewang.springbootmall.model.Order;
import com.winniewang.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    List<OrderItem> getOrderItemByOrderId(Integer orderId);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    Order getOrderById(Integer orderId);
}
