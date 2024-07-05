package com.example.demo.Product.commandhandlers;

import org.springframework.http.ResponseEntity;
import com.example.demo.Command;
import com.example.demo.Product.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;


public class CreateProductCommandHandler implements Command<Product, ResponseEntity> {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public ResponseEntity execute(Product product) {
        productRepo.save(product);
        return ResponseEntity.ok().build();
    }
}
