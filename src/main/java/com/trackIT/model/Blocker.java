package com.trackIT.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "blockers")
public class Blocker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private String topic;
    private boolean resolved;
    private LocalDate dateLogged;

    @ManyToOne
    @JoinColumn(name = "assignment_id")
    private Assignment assignment;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
