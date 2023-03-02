package mvcspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model){
    	//using model to access view
        System.out.println("checkpoint 1");
        model.addAttribute("key", "Pass to the home page");
        int x = 2170036;
        model.addAttribute("int", x);
        List<String> l = new ArrayList<String>();
        l.add("hello");
        l.add("data");
        l.add("complete");
        l.add("goodluck");
        model.addAttribute("list", l);
        return "home";
    }
    @RequestMapping("/modelandview")
    public ModelAndView modelandview() {
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(4);
    	ModelAndView modelandview = new ModelAndView();
    	modelandview.addObject("name","ashwini kumar");
    	modelandview.addObject("list",list);
    	modelandview.setViewName("modelandview");
    	return modelandview;
    }
    
}
