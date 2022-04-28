package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<task,String> {

    List<task> saveAll();
    
}
