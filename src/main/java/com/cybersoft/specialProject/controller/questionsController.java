package com.cybersoft.specialProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("questions")
public class questionsController {
    boolean isLogin=false;

    @GetMapping("login")
    public String loginPage(){
        return "login";
    }
    @GetMapping("enterTheQuestion")
    public String updatepage(@RequestParam("password") String password) {

        if (password.equals("123")) {
            isLogin = true;
            return "enterTheQuestion";
        } else {
            isLogin = false;
            return "redirect:/login";
        }
    }
}
