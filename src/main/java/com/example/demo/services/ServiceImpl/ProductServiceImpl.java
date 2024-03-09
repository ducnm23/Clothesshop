package com.example.demo.services.ServiceImpl;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public int save(Product product) {
        try{
            productRepository.save(product);
            return 1;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
