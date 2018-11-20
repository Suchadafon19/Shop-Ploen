package com.example.Sw;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    } 
    public Optional<Product> getProductById(long id){
        return productRepository.findById(id);
    }
    public Product decreaseProductAmount(Product product){
        System.out.println("product No "+product.getProductNo());
        System.out.println("product amount "+product.getAmount());
        return productRepository.save(product);
    }
}
