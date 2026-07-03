package com.restfulapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.restfulapi.dto.StudentDTO;
import com.restfulapi.entity.Student;
import com.restfulapi.service.StudnetService;
import jakarta.validation.Valid;

@RestController // Change this from @Controller to @RestController
@RequestMapping("/api/students")
public class StudentController {
	
	@Autowired
	private StudnetService ss;
	
	@PostMapping
	public ResponseEntity<Student> create(@Valid @RequestBody StudentDTO dto) {
	    return new ResponseEntity<>(ss.createStudent(dto), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Student>> getAll(){
		return new ResponseEntity<>(ss.getAllStudent(), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Student> update(@PathVariable Long id, @Valid @RequestBody StudentDTO dto) {
		return new ResponseEntity<>(ss.updateStudent(id, dto), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		ss.deleteStudent(id);
		return new ResponseEntity<>("Student Deleted Successfully", HttpStatus.OK);
	}
}