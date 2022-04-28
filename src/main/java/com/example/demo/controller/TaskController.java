package com.example.demo.controller;

import com.example.demo.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.task;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<task> getTask(){
        return taskService.find();
    }
    public List<task> getSaveTasks(){
        return taskService.save()
    }
}
