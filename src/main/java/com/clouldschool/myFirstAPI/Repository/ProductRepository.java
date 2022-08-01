package com.clouldschool.myFirstAPI.Repository;

import com.clouldschool.myFirstAPI.Model.Product;
import org.springframework.data.repository.CrudRepository;

interface ProductRepository extends CrudRepository<Product,Integer> {
    public void delete(Product product);
}
