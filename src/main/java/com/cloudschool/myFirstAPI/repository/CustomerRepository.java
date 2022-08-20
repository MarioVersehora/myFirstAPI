package com.cloudschool.myFirstAPI.repository;

import com.cloudschool.myFirstAPI.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
