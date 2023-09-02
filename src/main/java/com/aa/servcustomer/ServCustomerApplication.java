package com.aa.servcustomer;

import com.aa.servcustomer.entities.Customer;
import com.aa.servcustomer.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class ServCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServCustomerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner (CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                    .id(UUID.randomUUID().toString())
                    .name("C1")
                    .email("4000")
                    .build());
            customerRepository.save(Customer.builder()
                    .id(UUID.randomUUID().toString())
                    .name("C2")
                    .email("4000")
                    .build());
            customerRepository.save(Customer.builder()
                    .id(UUID.randomUUID().toString())
                    .name("C3")
                    .email("4000")
                    .build());

        };
    }

}
