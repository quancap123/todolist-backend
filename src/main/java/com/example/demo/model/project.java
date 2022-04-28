package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="project")
@Data
public class project {
    @Id
    private String id;
    @Column
    private String name;
    
}