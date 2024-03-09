package com.example.demo.services;

import com.example.demo.entities.OrderEntity;

public interface IOrderService {
    int save(OrderEntity orderEntity);
}
