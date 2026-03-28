package com.trackIT.repository;
import com.trackIT.model.CodingAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodingAssignmentRepository extends JpaRepository<CodingAssignment, Long>{
}
