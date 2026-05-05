package com.trackIT.exceptions;

public class AssignmentNotFoundException extends RuntimeException {
    public AssignmentNotFoundException(Long id) {
        super("No assignment found with the ID of " + id + ".");
    }
}
