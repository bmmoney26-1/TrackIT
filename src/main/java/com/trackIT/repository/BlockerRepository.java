package com.trackIT.repository;

import com.trackIT.model.Blocker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlockerRepository extends JpaRepository<Blocker, Long> {

    List<Blocker> findByStudentId(Long studentId);
}
