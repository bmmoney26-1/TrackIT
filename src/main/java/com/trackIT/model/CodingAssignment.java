package com.trackIT.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "coding_assignments")
public class CodingAssignment extends Assignment {
    private String programmingLanguage;
    private String repositoryUrl;
    private int linesOfCode;

}
