package springmvc.springcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("check");
        model.addAttribute("message","test data");
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("check");
        return "about";
    }

}