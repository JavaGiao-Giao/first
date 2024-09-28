package com.lgqlgq.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @RequestMapping("index")
    public String index(Model model) {
        model.addAttribute("msg", "Hello World");
        return "/hello";
    }
}
