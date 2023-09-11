package com.courseloiane.coursespring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courseloiane.coursespring.dtos.CourseDto;
import com.courseloiane.coursespring.services.CourseService;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {

    private CourseService service;
    @Autowired
    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping("/courses")
    public ResponseEntity<List<CourseDto>> findAll() {
        return service.findAll();
        
    }

    @GetMapping("/courses/{id}")
    public ResponseEntity<CourseDto> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/courses")
    public ResponseEntity<CourseDto> save(@RequestBody CourseDto dto) {
        return service.save(dto);
    }

    @PutMapping("/courses/{id}")
    public ResponseEntity<CourseDto> update(@PathVariable Long id, @RequestBody CourseDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/courses/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return service.delete(id);
    }
    
}
