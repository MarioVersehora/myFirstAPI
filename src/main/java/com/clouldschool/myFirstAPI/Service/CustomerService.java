package com.clouldschool.myFirstAPI.Service;

import com.clouldschool.myFirstAPI.Model.Customer;
import com.clouldschool.myFirstAPI.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    List<Customer> list = new ArrayList<>();

    public List<Customer> getAllCustomers() {
        List<Customer> aux = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

}


