package com.ecommerce.project.service;

import com.ecommerce.project.model.Order;

import java.util.List;

public interface PaymentService {
    void processPayment(Order order);
    void updatePayment(Order order);
    void cancelPayment(int orderId);
    List<Order> getAllPayments();
    Order getPaymentById(int orderId);
}
