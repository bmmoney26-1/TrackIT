package com.trackIT.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "learning_sessions")
public class LearningSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate sessionDate;
    private String topic;
    private int durationMinutes;
    private int confidenceLevel;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
