package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.Blogs;

@Repository
public interface BlogRepository extends JpaRepository<Blogs, Long> {
	@Query("select b from Blogs b order by created_date DESC")
	List<Blogs> latestItems();
}
