package com.trackIT.controller;

import com.trackIT.BootcampApp;
import com.trackIT.model.LearningSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class LearningSessionController {

    @Autowired
    private BootcampApp bootcampApp;

    @GetMapping("/{id}")
    public List<LearningSession> learningSessionId(@PathVariable Long id){
        return bootcampApp.getStudentLearningSession(id);
    }

    @PostMapping("/{id}")
    public LearningSession logSession(@RequestBody LearningSession learningSession, @PathVariable Long id){
        return bootcampApp.logLearningSession(learningSession, id);
    }
}