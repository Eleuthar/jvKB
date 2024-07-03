package com.demo.Product

import com.demo.Product.Model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.JpaRepository;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}