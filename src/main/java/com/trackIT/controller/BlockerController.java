package com.trackIT.controller;


import com.trackIT.BootcampApp;
import com.trackIT.model.Blocker;
import com.trackIT.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blockers")
public class BlockerController {
    @Autowired
    private BootcampApp bootcampApp;

    @PostMapping("/{id}")
    public Blocker addBlocker(@RequestBody Blocker blocker, @PathVariable Long id){

        return bootcampApp.createBlocker(blocker,id);
    }
    @GetMapping("/{id}")
    public List<Blocker> blockerId(@PathVariable Long id){
        return bootcampApp.getStudentBlockers(id);
    }

    @DeleteMapping("/{id}")
    public void blockerDeleteById (@PathVariable Long id){
        bootcampApp.deleteBlocker(id);
    }

    @PutMapping("/{id}")
    public Blocker updateBlocker(@RequestBody Blocker blocker){
        return bootcampApp.updateBlockerInfo(blocker);
    }



}
