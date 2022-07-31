package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Blogs;

@Repository
public interface BlogRepository extends JpaRepository<Blogs, Long> {

}
