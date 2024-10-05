package com.continuous_delivery_docker_and_jenkins.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CalculatorTest {
    private CalculatorService calculator = new CalculatorService();
    @Test
    public void testSum() {
        assertEquals(3, calculator.sum(1, 2));
    }
}
