package com.courseloiane.coursespring.dtos;

import com.courseloiane.coursespring.models.Course;

public record CourseDto(String name, String category) {

    public CourseDto(Course course) {
    this(course.getName(), course.getCategory());
        
    }
    
}
