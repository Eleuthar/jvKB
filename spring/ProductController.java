package com.demo

import com.demo.Product.Model.Product;
import com.demo.Product.ProductRepo;

import java.util.Collections;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        // return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.emptyList());
        return ResponseEntity.ok(productRepo.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Product>> getProduct(@PathVariable Integer id) {
        // return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.emptyList());
        return ResponseEntity.ok(productRepo.findById(id));
    }
}