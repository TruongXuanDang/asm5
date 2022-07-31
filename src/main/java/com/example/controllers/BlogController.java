package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entities.Blogs;
import com.example.entities.Categories;
import com.example.services.BlogService;
import com.example.services.CategoryService;

@Controller
public class BlogController {
	@Autowired
	private BlogService bService;
	@Autowired
	private CategoryService cService;
	
	@RequestMapping(value={"", "/", "/home"})
	public String viewHomePage(Model model) {
		List<Categories> listCategories = cService.listAll();
		List<Blogs> listBlogs = bService.listAll().subList(0, 3);
		List<Blogs> searchedListBlogs = listCategories.get(0).getBlogs();
		
		model.addAttribute("listCategories", listCategories);
		model.addAttribute("listBlogs", listBlogs);
		model.addAttribute("searchedListBlogs", searchedListBlogs);
		
		return "pages/home";
	}
	
	@RequestMapping(value="/getBlogs", method= RequestMethod.POST)
	public String saveProduct(Model model, int category_id) {
		List<Categories> listCategories = cService.listAll();
		List<Blogs> listBlogs = bService.listAll().subList(0, 3);
		List<Blogs> searchedListBlogs = listCategories.get(category_id).getBlogs();
		
		model.addAttribute("listCategories", listCategories);
		model.addAttribute("listBlogs", listBlogs);
		model.addAttribute("searchedListBlogs", searchedListBlogs);
		
		return "pages/home";
	}
}
