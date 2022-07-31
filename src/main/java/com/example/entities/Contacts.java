package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Contacts {
	private long id;
	@NotEmpty(message = "Name cannot be empty.")
	private String name; 
	@NotEmpty(message = "Email cannot be empty.")
	private String email;
	@NotEmpty(message = "Phone cannot be empty.")
	private String phone;
	@NotEmpty(message = "Company cannot be empty.")
	private String company;
	@NotEmpty(message = "Message cannot be empty.")
	private String message;
	
	public Contacts() {}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
