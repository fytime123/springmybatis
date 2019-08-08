package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("now", DateFormat.getDateInstance().format(new Date()));
//        ModelAndView m = new ModelAndView("hello");
//        m.addObject("now", "="+DateFormat.getDateInstance().format(new Date()));

        return "hello";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/block")
    public String block() {
        return "block";
    }
}
