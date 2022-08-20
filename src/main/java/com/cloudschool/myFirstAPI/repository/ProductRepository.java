package com.cloudschool.myFirstAPI.repository;

import com.cloudschool.myFirstAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Integer> {

}
