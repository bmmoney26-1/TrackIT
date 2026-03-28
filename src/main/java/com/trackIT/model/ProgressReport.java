package com.trackIT.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "progress_report")
public class ProgressReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int totalAssignmentsCompleted;
    private int totalBlockersLogged;
    private int totalStudyMinutes;
    private double averageConfidenceScore;
    private LocalDate reportDate;
    private int quarter;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
