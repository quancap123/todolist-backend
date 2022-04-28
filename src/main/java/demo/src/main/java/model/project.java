package demo.src.main.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="project")
@Data
public class project {
    @Column
    private String id;
    @Column
    private String name;
    
}