package com.courseloiane.coursespring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.courseloiane.coursespring.dtos.CourseDto;
import com.courseloiane.coursespring.exceptions.CourseException;
import com.courseloiane.coursespring.models.Course;
import com.courseloiane.coursespring.repositories.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository repository;
    @Autowired
    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public ResponseEntity<List<CourseDto>> findAll() {
        List<Course> list = repository.findAll();
        List<CourseDto> listDto = list.stream().map(obj -> new CourseDto(obj)).toList();
        return new ResponseEntity<List<CourseDto>>(listDto, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CourseDto> findById(Long id) {
        var course = repository.findById(id).orElseThrow(() -> new CourseException("Course Not Found"));
        return new ResponseEntity<CourseDto>(new CourseDto(course), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CourseDto> save(CourseDto dto) {
        Course course = new Course(dto);
        repository.save(course);
        return new ResponseEntity<CourseDto>(new CourseDto(course), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<CourseDto> update(Long id, CourseDto dto) {
        Course course = repository.findById(id).orElseThrow(() -> new CourseException("Course Not Found"));
        course = repository.findById(id).get();
        course.setName(dto.name());
        course.setCategory(dto.category());
        repository.save(course);
        return new ResponseEntity<CourseDto>(new CourseDto(course), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        Course course = repository.findById(id).orElseThrow(() -> new CourseException("Course Not Found"));
        course = repository.findById(id).get();
        repository.delete(course);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
    
}
