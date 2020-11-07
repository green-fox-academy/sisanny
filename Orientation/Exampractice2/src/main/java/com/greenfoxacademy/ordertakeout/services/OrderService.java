package com.greenfoxacademy.ordertakeout.services;

import com.greenfoxacademy.ordertakeout.models.OrderTakeout;

import java.util.List;

public interface OrderService {
    OrderTakeout findById(int id);
    void save(OrderTakeout order);
    boolean isStatusCorrect(String status, OrderTakeout orderTakeout);
    String getType(String topping);
    List<OrderTakeout> findAll();
    List<OrderTakeout> getAllBasedOnTypeAndStatus(String status, String type);
    boolean isTypeAndStatusValid(String type, String status);
    boolean isStatusValid(String status);
}
