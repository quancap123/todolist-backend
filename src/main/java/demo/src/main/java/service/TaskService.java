package demo.src.main.java.service;

import org.springframework.beans.factory.annotation.Autowired;

import demo.src.main.java.repository.TaskRepository;

public class TaskService {
    
    @Autowired
    private TaskRepository taskRepository;

    public void add() {
        taskRepository.findAll();
    }
}
