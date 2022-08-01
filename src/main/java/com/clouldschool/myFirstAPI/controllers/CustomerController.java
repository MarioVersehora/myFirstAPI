package com.clouldschool.myFirstAPI.controllers;

import com.clouldschool.myFirstAPI.Model.Customer;
import com.clouldschool.myFirstAPI.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
