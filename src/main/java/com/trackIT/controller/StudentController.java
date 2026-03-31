package com.trackIT.controller;


import com.trackIT.BootcampApp;
import com.trackIT.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private BootcampApp bootcampApp;

    @GetMapping
   public List<Student> studentList(){

        return bootcampApp.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){

        return bootcampApp.createStudent(student);
    }
@GetMapping("/{id}")
    public Optional<Student> studentId(@PathVariable Long id){
return bootcampApp.getStudentById(id);
    }


    }

