package com.trackIT.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "student_roster")
public class StudentRoster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rosterName;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToMany
    @JoinTable(
            name = "roster_students",
            joinColumns = @JoinColumn(name = "roster_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )

    private List<Student> students;
}
