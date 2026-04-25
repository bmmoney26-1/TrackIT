package com.trackIT.controller;


import com.trackIT.BootcampApp;
import com.trackIT.model.Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignments")
public class AssignmentController {
@Autowired
 private BootcampApp bootcampApp;

    @GetMapping("/{id}")
    public List<Assignment> assignmentsId(@PathVariable Long id){
        return bootcampApp.getStudentAssignments(id);
    }

    @PatchMapping("/{id}")
    public Assignment updateAssignmentStatus(@PathVariable Long id, @RequestParam String status){
        return bootcampApp.updateAssignmentStatus(id, status);
    }
}
