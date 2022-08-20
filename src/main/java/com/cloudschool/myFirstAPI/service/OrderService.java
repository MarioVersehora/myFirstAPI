package com.cloudschool.myFirstAPI.service;

import com.cloudschool.myFirstAPI.model.Orders;
import com.cloudschool.myFirstAPI.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    public Orders saveOrder(Orders order) {
        return orderRepository.save(order);
    }
}
