package com.example.demo.resource;

import com.example.demo.entities.Product;
import com.example.demo.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRest {
    @Autowired
    private IProductService iProductService;

    @PostMapping("/save")
    private ResponseEntity<String> save(@RequestBody Product product){
        iProductService.save(product);
        return new ResponseEntity<>("oki ", HttpStatus.OK);
    }
}
