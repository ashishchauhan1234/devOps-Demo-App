package com.devOps.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping({"/", ""})
    public String getHello(){
        System.out.println("Welcome to my home controller \n\n ");
        return "Hello World!<br/><br/> Welcome to my home page.";
    }
}
