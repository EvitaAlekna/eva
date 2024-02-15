package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String getHomePage() {
        return "homePage";
    }

    @GetMapping("/error")
    public String getErrorPage() {
        return "pizdec";
    }
}
