package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Blogs;
import com.example.entities.Categories;
import com.example.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repo;
	
	public List<Categories> listAll() {
		return repo.findAll();
	}
	
	public Categories get(long id) {
		return repo.findById(id).get();
	}
}
