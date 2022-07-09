package jp.co.sunarch.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloWorldController {
	
	@GetMapping("/")
	public String message(Model model) {
		model.addAttribute("message","Test");
		return "Hello";
	}
	

}
