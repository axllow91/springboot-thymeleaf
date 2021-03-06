package com.mrn.springbootthymleaf.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Value("${spring.application.name}")
    private String message;

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("hello", message);
        return "index";
    }
}
