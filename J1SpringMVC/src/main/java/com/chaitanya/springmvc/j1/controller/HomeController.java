package com.chaitanya.springmvc.j1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("i am here");
        return "pqr";
    }
}
