package com.example.Sw;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",allowCredentials = "true")
public class ProductController {
    @Autowired
    ProductService productService;
    
    @GetMapping("/getAllProduct")
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }
    @GetMapping("/{product_no}")
    public ResponseEntity<Optional<Product>> getProductByID(@PathVariable("product_no") long productNo){
        return new ResponseEntity<> ((productService.getProductById(productNo)), HttpStatus.OK);
    }
}