package com.trackIT;

import com.trackIT.model.Blocker;
import com.trackIT.model.Student;
import com.trackIT.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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


    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudentInfo(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> getStudentProgress(Long id) {
        return studentRepository.findById(id);
    }

public Blocker createBlocker(Blocker blocker, Long id){
    Optional<Student> blockerBelongsToo = getStudentById(id);
blocker.setStudent(blockerBelongsToo.get());
return blockerRepository.save(blocker);
}

}
