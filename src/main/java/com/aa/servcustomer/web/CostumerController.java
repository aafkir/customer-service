package com.aa.servcustomer.web;

import com.aa.servcustomer.entities.Customer;
import com.aa.servcustomer.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CostumerController {

    public CustomerRepository customerRepository ;
    @GetMapping("/api")
    public List<Customer> customerList(){
        return customerRepository.findAll();
    }

}
