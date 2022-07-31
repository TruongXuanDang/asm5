package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Product;
import com.example.entities.Blogs;
import com.example.repositories.BlogRepository;

@Service
public class BlogService {
	@Autowired
	private BlogRepository repo;
	
	public List<Blogs> listAll() {
		return repo.findAll();
	}
	
	public List<Blogs> latestItems() {
		return repo.latestItems();
	}
}
