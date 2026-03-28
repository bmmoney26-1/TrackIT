package com.trackIT.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "assignments")
public abstract class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String status;
    private LocalDate dueDate;
    private boolean completed;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;


}
