package com.mtyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HelloController {

    @RequestMapping("/mvc")
    public String HelloMvc() {
        return "home";
    }

    @RequestMapping("/list")
    public String mainList() {
        return "list";
    }
}
