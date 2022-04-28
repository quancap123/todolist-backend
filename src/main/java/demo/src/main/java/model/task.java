package demo.src.main.java.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="task")
@Data
public class task {
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private String discription;
    @Column
    private Date create_at;
    @Column
    private boolean checked;
    @Column
    private String project_id;
    
}
