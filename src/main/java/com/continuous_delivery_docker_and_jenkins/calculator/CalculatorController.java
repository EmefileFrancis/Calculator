package com.continuous_delivery_docker_and_jenkins.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/calculator")
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/sum")
    public String calculateSum(@RequestParam("a") int a, @RequestParam("b") int b) {
        return String.valueOf(calculatorService.sum(a, b));
    }
}
