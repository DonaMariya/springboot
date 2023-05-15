package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class sample {
    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Heyyyyyyyyyyyy";
    }
}
