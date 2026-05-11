package com.trackIT.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
@ExceptionHandler(StudentNotFoundException.class)
   public ResponseEntity<String> handleStudentNotFound(StudentNotFoundException ex){
    return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
}

@ExceptionHandler(AssignmentNotFoundException.class)
    public ResponseEntity<String> handleAssignmentNotFound(AssignmentNotFoundException ex) {
    return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
}

@ExceptionHandler(BlockerNotFoundException.class)
    public ResponseEntity<String> handleBlockerNotFound(BlockerNotFoundException ex){
    return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
}

@ExceptionHandler(NoteNotFoundException.class)
    public ResponseEntity<String> handleNoteNotFound(NoteNotFoundException ex){
    return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
}

@ExceptionHandler(InvalidConfidenceLevelException.class)
    public ResponseEntity<String> handleInvalidConfidenceLevel(InvalidConfidenceLevelException ex){
    return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);
}

}
