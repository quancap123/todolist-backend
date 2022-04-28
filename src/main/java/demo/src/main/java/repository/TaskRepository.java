package demo.src.main.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.src.main.java.model.task;

@Repository
public interface TaskRepository extends JpaRepository<task,String> {
    
}
