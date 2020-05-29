package com.sda.special_tools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserFrontEndController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/search")
    public String search() {
        return "search";
    }

    @GetMapping("/account")
    public String account() {
        return "account";
    }

    @GetMapping("/basket")
    public String basket() {
        return "basket";
    }
}
