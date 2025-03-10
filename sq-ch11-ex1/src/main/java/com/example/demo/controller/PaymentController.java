package com.example.demo.controller;


import com.example.demo.Payment;
import com.example.demo.PaymentsProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentController {

    private final PaymentsProxy paymentsProxy;

    public PaymentController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }

    private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    @PostMapping("/payment")
    public Payment createPayment(@RequestHeader String requestId,
                                                 @RequestBody Payment payment
    ) {
        logger.info("RequestId : " + requestId +
                ";Payment Amount : " + payment.getAmount());

        payment.setId(UUID.randomUUID().toString());

        return paymentsProxy.createPayment(requestId,payment);
    }

}
