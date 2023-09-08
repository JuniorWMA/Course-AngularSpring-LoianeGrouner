package com.courseloiane.coursespring.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.courseloiane.coursespring.dtos.CourseDto;

public interface CourseService {
    
    public ResponseEntity<List<CourseDto>> findAll();

    public ResponseEntity<CourseDto> findById(Long id);

    public ResponseEntity<CourseDto> save(CourseDto dto);

    public ResponseEntity<CourseDto> update(Long id, CourseDto dto);

    public ResponseEntity<Void> delete(Long id);
}
