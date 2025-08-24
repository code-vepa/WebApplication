package com.codevepa.webapplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping ("/")
    public String home() {
        return "Welcome to CodeVepa!";
    }

    @RequestMapping("/about")
    public String about() {
        return "Here's the about page";
    }
}
