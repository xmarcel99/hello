package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("")
public class HelloController {


    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello " + LocalDateTime.now();
    }
}
