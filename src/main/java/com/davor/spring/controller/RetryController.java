package com.davor.spring.controller;

import com.davor.spring.service.RetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetryController {

    @Autowired
    private RetryService retryService;

    @GetMapping("/v1/retry")
    public String getRetryDemo() {
        return retryService.checkRetry();
    }
}
