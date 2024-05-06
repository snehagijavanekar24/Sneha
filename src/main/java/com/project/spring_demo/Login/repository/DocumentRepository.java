package com.project.spring_demo.Login.repository;


import com.project.spring_demo.Login.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document,String> {
}
