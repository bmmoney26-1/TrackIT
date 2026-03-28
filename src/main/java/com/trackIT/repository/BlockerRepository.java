package com.trackIT.repository;
import com.trackIT.model.Blocker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockerRepository extends JpaRepository <Blocker, Long> {
}
