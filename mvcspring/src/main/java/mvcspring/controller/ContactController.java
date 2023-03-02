package mvcspring.controller;

import mvcspring.entity.User;
import mvcspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	@ModelAttribute
	public void common(Model model){
		model.addAttribute("extra","data2");
	}
	@RequestMapping(path = "/contact")
	public String contact(Model model) {
		//model.addAttribute("extra","data");
		return "contact";
	}
//	@RequestMapping(path = "/contactForm", method=RequestMethod.POST)
//	public String form(HttpServletRequest req,Model model) {
//		String email = req.getParameter("email");
//		//System.out.println(req);
//		model.addAttribute("key", email);
//		return "success";
//	}
//
//	@RequestMapping(path = "/contactForm", method=RequestMethod.POST)
//	public String form(
//			@RequestParam("email") String email,
//			@RequestParam("pass") String pass,
//			Model model) {
//		model.addAttribute("email", email);
//		model.addAttribute("pass", pass);
//		return "success";
//	}
	@RequestMapping(path = "/contactForm", method=RequestMethod.POST)
	public String form(@ModelAttribute User user, Model model) {
		//model.addAttribute("extra","data");
//		System.out.println(user.getEmail());
		this.userService.insert(user);
		model.addAttribute("user", user);
		return "success";
	}
}
