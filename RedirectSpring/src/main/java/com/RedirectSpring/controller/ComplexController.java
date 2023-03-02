package com.RedirectSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.RedirectSpring.entity.Student;

@Controller
public class ComplexController {

    @RequestMapping(value="/Student", method=RequestMethod.GET)
    public String showForm() {
        return "complex";
    }

    @RequestMapping(value = "/Student", method = RequestMethod.POST)
    public RedirectView handleForm(@ModelAttribute("student") Student student){
        System.out.println(student);
        return new RedirectView("Student");
    }
}
