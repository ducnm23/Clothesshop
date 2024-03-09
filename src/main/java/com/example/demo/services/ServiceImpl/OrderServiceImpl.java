package com.example.demo.services.ServiceImpl;

import com.example.demo.entities.OrderEntity;
import com.example.demo.repositories.OrderRepository;
import com.example.demo.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public int save(OrderEntity orderEntity) {
        try{
            orderRepository.save(orderEntity);
            return 1;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
