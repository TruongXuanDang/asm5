package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Contacts;
import com.example.entities.Messages;
import com.example.repositories.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository repo;
	
	public List<Contacts> listAll() {
		return repo.findAll();
	}
	
	public void save(Contacts contact) {
		repo.save(contact);
	}
}
