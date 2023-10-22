package com.fraudetect.customer.service;

import com.fraudetect.customer.model.Customer;
import com.fraudetect.customer.model.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo: check email is valid
        // todo: check if email is not taken
        // todo: add customer to the db
    }
}
