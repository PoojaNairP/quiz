package com.example.review.Administrator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Administrator_Jpa extends JpaRepository<Administrator_Entity, Long> {
}