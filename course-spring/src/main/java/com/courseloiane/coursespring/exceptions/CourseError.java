package com.courseloiane.coursespring.exceptions;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseError {
    
    private Integer status;
    private String message;
    private Timestamp timestamp;


}
