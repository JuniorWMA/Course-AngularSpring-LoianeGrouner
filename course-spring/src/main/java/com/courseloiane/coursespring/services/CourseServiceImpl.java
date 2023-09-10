package com.courseloiane.coursespring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.courseloiane.coursespring.dtos.CourseDto;
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
        
    }

    @Override
    public ResponseEntity<CourseDto> save(CourseDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public ResponseEntity<CourseDto> update(Long id, CourseDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
