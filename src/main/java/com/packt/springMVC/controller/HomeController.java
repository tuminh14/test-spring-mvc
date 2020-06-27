package com.packt.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/test")
public class HomeController {

    public String index(Model model) {
        model.addAttribute("Greeting", "Welcome to webstore");
        model.addAttribute("tagline","The one and only amazing webstore");
        return "welcome";
    }
}
