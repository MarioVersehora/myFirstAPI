package com.clouldschool.myFirstAPI.Repository;

import com.clouldschool.myFirstAPI.Model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Orders,Integer> {
    public List<Orders> findAll();
}
