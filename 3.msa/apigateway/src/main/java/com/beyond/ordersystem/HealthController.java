package com.beyond.ordersystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    public String subscribe(){
        return "apigateway ok";
    }
}
