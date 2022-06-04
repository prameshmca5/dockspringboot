package com.ramesh.dockspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class HelloController {

    @GetMapping("/hello")
    public String getWelcome() {
        return "Hello Welcome my spring boot";
    }
}
