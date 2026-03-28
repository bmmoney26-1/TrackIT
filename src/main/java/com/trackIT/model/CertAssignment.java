package com.trackIT.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cert_assignments")
public class CertAssignment extends Assignment {
    private String certificationName;
    private String certProvider;
    private int passingScore;
}
