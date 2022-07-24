package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MockController {
	@RequestMapping("/home")
	public String viewHomePage(Model model) {
		return "pages/home";
	}
	
	@RequestMapping("/contact")
	public String viewContactPage(Model model) {
		return "pages/contact";
	}
}
