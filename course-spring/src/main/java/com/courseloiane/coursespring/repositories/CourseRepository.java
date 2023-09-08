package com.courseloiane.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseloiane.coursespring.models.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
