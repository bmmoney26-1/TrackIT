package com.trackIT.repository;

import com.trackIT.model.StudentRoster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRosterRepository extends JpaRepository<StudentRoster, Long> {
}
