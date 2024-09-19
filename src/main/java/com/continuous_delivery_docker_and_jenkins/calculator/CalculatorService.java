package com.continuous_delivery_docker_and_jenkins.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int sum(int a, int b) {
        return a + b;
    }
}
