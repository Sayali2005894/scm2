package com.example.scm2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model)
    {
        model.addAttribute("name","shree technology");
        model.addAttribute("githubrepository","https://github.com/Sayali2005894");
        return"home";
    }

    @RequestMapping("/about")
    public String aboutpage()
    {
        System.out.println("abot page loading");
        return "about";
    }
}
