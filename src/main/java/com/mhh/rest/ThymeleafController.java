package com.mhh.rest;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThymeleafController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World Bro!");
        return "hello"; // means hello.html

    }

    @GetMapping("/form") // OR  @RequestMapping("/form")
    public String form(Model model) {
        return "hello-form";
    }

    @GetMapping("/processForm")
    public String processForm(Model model) {
        return "say-hello";
    }

    @RequestMapping("/shout")
    public String letShout(HttpServletRequest request, Model model) {

        String studentName = request.getParameter("studentName");
        String result = "YO !" + studentName.toUpperCase();
        model.addAttribute("message", result);
        return "say-hello";
    }

    //@RequestMapping(value = "/shout2",method = RequestMethod.GET)
    //OR
    @GetMapping("/shout2")
    public String letShout_V2(@RequestParam("studentName") String studentName, Model model) {

        String result = "HeY My Friend ! " + studentName.toUpperCase();
        model.addAttribute("message", result);
        return "say-hello";
    }

}
