package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.model.task;
import com.example.demo.repository.TaskRepository;

@Component
public class TaskService {
    
    @Autowired
    private TaskRepository taskRepository;

    public List<task> find() {
        taskRepository.findAll().stream().forEach(System.out::println);
        return taskRepository.findAll();
    }
    public List<task> save() {
        taskRepository.saveAll();
        return taskRepository.saveAll();
    }
}
