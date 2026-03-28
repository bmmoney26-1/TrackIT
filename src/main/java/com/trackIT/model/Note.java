package com.trackIT.model;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private String tags;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private LearningSession session;

    @ManyToOne
    @JoinColumn(name = "assignment_id")
    private Assignment assignment;

    @ManyToOne
    @JoinColumn(name = "blocker_id")
    private Blocker blocker;

}
