package com.davor.spring.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
public class RetryServiceImpl implements RetryService {

    @Retryable(value = ArithmeticException.class, maxAttempts = 3, backoff = @Backoff(value = 5000))
    @Override
    public String checkRetry() {
        System.out.println("Check Retry Method Service Started");
        int n = 0;
        int wrongOperation = 5 / n;

        return "SUCCESS";
    }

    @Recover
    @Override
    public String getRecoveryAfterCheckRetry() {
        return "Service is out of service temporarily";
    }
}
