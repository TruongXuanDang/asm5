package com.example.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entities.Categories;
import com.example.entities.Contacts;
import com.example.entities.Messages;
import com.example.services.CategoryService;
import com.example.services.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService service;
	@Autowired
	private CategoryService cService;
	
	@RequestMapping("/contact")
	public String viewContactPage(Model model) {
		List<Categories> listCategories = cService.listAll();
		Contacts contact = new Contacts();
		model.addAttribute("contact", contact);
		model.addAttribute("listCategories", listCategories);
		return "pages/contact";
	}
	
	@RequestMapping(value="/saveContact", method= RequestMethod.POST)
	public String saveContact(@Valid Contacts contact, BindingResult result, Model model) {
		if (result.hasErrors()) {
		    return "redirect:/contact";
		}
		service.save(contact);
		return "redirect:/contact";
	}
}
