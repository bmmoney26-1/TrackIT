package com.trackIT.exceptions;

public class InvalidConfidenceLevelException extends RuntimeException {
    public InvalidConfidenceLevelException() {
        super("Invalid confidence level entered. Please choose a number between 1-10.");
    }
}
