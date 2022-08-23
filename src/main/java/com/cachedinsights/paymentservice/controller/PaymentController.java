package com.cachedinsights.paymentservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pay")
public class PaymentController
{
    private static final Logger logger = LoggerFactory.getLogger("PaymentController");

    @GetMapping("/{id}")
    public ResponseEntity<String> pay(@PathVariable("id") String id)
    {
        logger.debug("Initiating payment for id : {}. . .",id);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<String>("Payment Completed Successfully.", HttpStatus.OK);
    }
}
