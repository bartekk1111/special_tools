package com.sda.special_tools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserFrontEndController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
