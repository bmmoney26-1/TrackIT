package com.trackIT.repository;
import com.trackIT.model.CertAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertAssignmentRepository extends JpaRepository<CertAssignment, Long>{
}
