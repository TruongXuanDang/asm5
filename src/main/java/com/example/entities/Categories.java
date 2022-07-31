package com.example.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	
	@OneToMany(targetEntity=Blogs.class, mappedBy = "category", fetch = FetchType.EAGER) 
	private List<Blogs> blogs;
	
	public Categories() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Blogs> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blogs> blogs) {
		this.blogs = blogs;
	}

}
