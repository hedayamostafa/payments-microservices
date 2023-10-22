package com.fraudetect.customer.model;

public record CustomerRegistrationRequest (
        String firstName,
        String lastName,
        String email
){
}
