package com.clouldschool.myFirstAPI.Repository;

import com.clouldschool.myFirstAPI.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.ResultSet;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {

    public Customer getById(String customerId);


}
