package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Contacts;

@Repository
public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
