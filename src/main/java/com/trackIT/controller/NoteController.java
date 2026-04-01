package com.trackIT.controller;

import com.trackIT.BootcampApp;
import com.trackIT.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    private BootcampApp bootcampApp;

    @PostMapping
    public Note addNote(@RequestBody Note note) {

        return bootcampApp.createNote(note);
    }

    @GetMapping("/{id}")
    public Optional<Note> noteId(@PathVariable Long id) {
        return bootcampApp.getNoteById(id);
    }

    @DeleteMapping("/{id}")
    public void noteDeleteById(@PathVariable Long id) {
        bootcampApp.deleteNote(id);
    }

    @PutMapping("/{id}")
    public Note updateNote(@RequestBody Note note, @PathVariable Long id) {
        return bootcampApp.updateNoteInfo(note);
    }
}

