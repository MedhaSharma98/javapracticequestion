package com.hashmap.questions.foodorderingsystem.services;

import com.hashmap.questions.foodorderingsystem.model.Customer;

public interface OrderInterface {
    public double placeOrderAndGetAmount(Customer customer);
    public void cancelOrder(int orderId);
}
