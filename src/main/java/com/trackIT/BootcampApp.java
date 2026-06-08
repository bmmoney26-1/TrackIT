package com.trackIT;

import com.trackIT.exceptions.AssignmentNotFoundException;
import com.trackIT.exceptions.StudentNotFoundException;
import com.trackIT.model.*;
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

    public Student getStudentById(Long id){
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    public void deleteStudent(Long id){
        if (!studentRepository.existsById(id)){
            throw new StudentNotFoundException(id);
        }
        studentRepository.deleteById(id);
    }

    public Student updateStudentInfo(Long id, Student student){
        if (!studentRepository.existsById(id)){
            throw new StudentNotFoundException(id);
        }
        return studentRepository.save(student);
    }

    public Optional<Student> getStudentProgress(Long id) {
        return studentRepository.findById(id);
    }

    public Blocker createBlocker(Blocker blocker, Long id) {
        Student student = getStudentById(id);
        blocker.setStudent(student);
        return blockerRepository.save(blocker);
    }

    public List<Blocker> getStudentBlockers(Long id) {

        return blockerRepository.findByStudentId(id);
    }
    public LearningSession logLearningSession(LearningSession learningSession, Long id) {
        Student student = getStudentById(id);
        learningSession.setStudent(student);
        return learningSessionRepository.save(learningSession);
    }

public Note createNote(Note note){

        return noteRepository.save(note);
}
    public List<Assignment> getStudentAssignments(Long id) {

        return assignmentRepository.findByStudentId(id);
    }
    public Assignment updateAssignmentStatus(Long id, String status){
        Assignment assignment = assignmentRepository.findById(id)
                .orElseThrow(() -> new AssignmentNotFoundException(id));
        assignment.setStatus(status);
        return assignmentRepository.save(assignment);
    }

    public void deleteBlocker(Long id) {
        blockerRepository.deleteById(id);
    }

    public Blocker updateBlockerInfo(Blocker blocker) {
        return blockerRepository.save(blocker);
    }

    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
    public Note updateNoteInfo(Note note) {
        return noteRepository.save(note);
    }

    public Optional<Note> getNoteById(Long id) {

        return noteRepository.findById(id);
    }

    //Future implementation using complex queries
//   public List<Note> getStudentNotes(Long id){
//
//        return noteRepository.findByStudentId(id);
//   }

}

