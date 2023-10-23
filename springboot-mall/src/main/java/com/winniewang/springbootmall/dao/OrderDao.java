package com.winniewang.springbootmall.dao;

import com.winniewang.springbootmall.dto.OrderQueryParams;
import com.winniewang.springbootmall.model.Order;
import com.winniewang.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer createOrder(Integer userId, Integer totalAmount);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);

    Order getOrderById(Integer orderId);
}
