package com.trackIT.exceptions;

public class BlockerNotFoundException extends RuntimeException {
    public BlockerNotFoundException(Long id) {
        super("No blocker found with the ID of: " + id + ".");
    }
}
