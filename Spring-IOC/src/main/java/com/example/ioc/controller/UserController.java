package com.example.ioc.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    public String sayHello(){
        return "hello";
    }
}
