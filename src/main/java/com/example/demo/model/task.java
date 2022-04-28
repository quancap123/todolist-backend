package com.example.demo.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="task")
@ToString
@Data
public class task {

    @Id
    @Column
    private String id;

    @Column(name = "task_name")
    private String name;

    @Column(name = "task_description")
    private String description;
    @Column
    private Date create_at;
    @Column
    private boolean checked;
    @Column
    private String project_id;
    
}
