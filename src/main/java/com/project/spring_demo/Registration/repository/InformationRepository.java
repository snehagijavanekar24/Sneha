package com.project.spring_demo.Registration.repository;


import com.project.spring_demo.Registration.model.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<Information,String> {
}
