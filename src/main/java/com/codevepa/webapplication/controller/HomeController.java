package com.codevepa.webapplication.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping ("/")
    public String home() {
        return "index.html";
    }

    @RequestMapping("/about")
    public String about() {
        return "Here's the about page";
    }
}
