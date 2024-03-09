package com.example.demo.resource;

import com.example.demo.entities.OrderEntity;
import com.example.demo.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderRest {
    @Autowired
    private IOrderService iOrderService;

    @PostMapping("save")
    private ResponseEntity<String>save(@RequestBody OrderEntity orderEntity){
        iOrderService.save(orderEntity);
        return new ResponseEntity<>("oki or not oki", HttpStatus.OK);
    }
}
