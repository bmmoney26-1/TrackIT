package com.trackIT;

import com.trackIT.model.Student;
import com.trackIT.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BootcampApp {
@Autowired
private StudentRepository studentRepository;

@Autowired
    private BlockerRepository blockerRepository;

@Autowired
    private AssignmentRepository assignmentRepository;

@Autowired
    private CertAssignmentRepository certAssignmentRepository;

@Autowired
    private CodingAssignmentRepository codingAssignmentRepository;

@Autowired
    private LearningSessionRepository learningSessionRepository;

@Autowired
    private NoteRepository noteRepository;

@Autowired
    private ProgressReportRepository progressReportRepository;

@Autowired
    private StudentRosterRepository studentRosterRepository;

}
