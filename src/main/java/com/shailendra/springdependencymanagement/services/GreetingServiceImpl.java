package com.shailendra.springdependencymanagement.services;

import org.springframework.stereotype.Service;

@Service("originalGreetingService")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone!!";
    }
}
