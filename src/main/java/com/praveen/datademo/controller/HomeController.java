package com.praveen.datademo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String great(){
        return "Welcome to SpringWeb World";
    }

    @RequestMapping("/about")
    public String about(){
        return "About is empty for now";
    }



}
