package com.davor.spring.service;

public interface RetryService {
    String checkRetry();
    String getRecoveryAfterCheckRetry();
}
