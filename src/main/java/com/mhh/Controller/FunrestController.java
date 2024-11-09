package com.mhh.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunrestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
