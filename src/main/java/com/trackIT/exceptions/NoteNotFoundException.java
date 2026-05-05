package com.trackIT.exceptions;

public class NoteNotFoundException extends RuntimeException {
    public NoteNotFoundException(Long id) {
        super("No notes were found with this ID " + id + ".");
    }
}
