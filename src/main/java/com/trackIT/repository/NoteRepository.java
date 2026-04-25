package com.trackIT.repository;

import com.trackIT.model.Blocker;
import com.trackIT.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    //Future implementation using complex queries
//    List<Note> findByStudentId(Long studentId);
}


