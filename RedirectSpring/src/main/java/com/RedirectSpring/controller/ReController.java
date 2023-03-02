package com.RedirectSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
    @RequestMapping("/home")
    public String index() {
        return "home";
    }
    @RequestMapping("/search")
    public RedirectView search(@RequestParam("search") String search){
        return new RedirectView("https://www.google.com/search?q="+search);
    }
    @RequestMapping("/book/{id}")
    public String getId(@PathVariable("id") int id){
        System.out.println(id/0);
        return "";
    }
//    @ExceptionHandler(value= ArithmeticException.class)
//    public String errorHandler(){
//        System.out.println("Dive by zero");
//        return "";
//    }
}
