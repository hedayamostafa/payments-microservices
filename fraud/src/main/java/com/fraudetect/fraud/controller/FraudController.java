package com.fraudetect.fraud.controller;

import com.fraudetect.fraud.model.FraudCheckResponse;
import com.fraudetect.fraud.service.FraudCheckService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
public record FraudController(FraudCheckService fraudCheckService) {

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable("customerId") Long customerId) {

        boolean isFraudulentCustomer = fraudCheckService().isFraudulentCustomer(customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
