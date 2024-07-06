package com.example.demo.Product;

import com.example.demo.Command;
import com.example.demo.Product.Model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.JpaRepository;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    @Service
    class CreateProductCommandHandler implements Command<Product, ResponseEntity> {

        private ProductRepo productRepo;

        @Override
        public ResponseEntity execute(Product product) {
            productRepo.save(product);
            return ResponseEntity.ok().build();
        }
    }
}