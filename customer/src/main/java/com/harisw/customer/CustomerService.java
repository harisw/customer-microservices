package com.harisw.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    //Builder pattern
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //To check : email validation, email duplicate, store in db
    }
}