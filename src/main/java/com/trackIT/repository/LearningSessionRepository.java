package com.trackIT.repository;
import com.trackIT.model.LearningSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningSessionRepository extends JpaRepository<LearningSession, Long>{
}
