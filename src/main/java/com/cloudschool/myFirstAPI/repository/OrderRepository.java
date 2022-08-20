package com.cloudschool.myFirstAPI.repository;

import com.cloudschool.myFirstAPI.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Orders,Integer> {

}
