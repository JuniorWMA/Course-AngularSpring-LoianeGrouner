package com.courseloiane.coursespring.exceptions;

import java.sql.Timestamp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CourseException.class)
    public ResponseEntity<CourseError> handleException(CourseException e, WebRequest request) {
        CourseError error = new CourseError();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(e.getMessage());
        error.setTimestamp(new Timestamp(System.currentTimeMillis()));

        return new ResponseEntity<CourseError>(error, HttpStatus.NOT_FOUND);
        
    }
    
}
