package com.secure.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class HomeController {

    @ResponseBody
    @GetMapping("/")
    public String index(){
        return "hello world";
    }

    @ResponseBody
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}