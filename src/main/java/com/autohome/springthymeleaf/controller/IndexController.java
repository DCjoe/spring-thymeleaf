package com.autohome.springthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dengcheng
 * @create 2018-01-26 14:57
 **/
@Controller
public class IndexController {
    @RequestMapping("/")
    public String indexPage(){
        return "index";
    }
    @RequestMapping("/home")
    public String homePage(){
        return "home";
    }
    @RequestMapping("/chart")
    public String chartPage(){
        return "chart";
    }
}
