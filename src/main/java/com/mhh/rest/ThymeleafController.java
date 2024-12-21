package com.mhh.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World Bro!");
        return "hello"; // means hello.html

    }
}
