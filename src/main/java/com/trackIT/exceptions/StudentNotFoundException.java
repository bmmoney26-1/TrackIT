package com.trackIT.exceptions;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long id) {
        super("No student found with the ID number " + id + ".");

    }
}
