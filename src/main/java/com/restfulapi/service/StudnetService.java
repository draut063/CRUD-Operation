package com.restfulapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restfulapi.dto.StudentDTO;
import com.restfulapi.entity.Student;

@Service
public interface StudnetService {

	Student createStudent(StudentDTO std);
	List<Student> getAllStudent();
	Student updateStudent(Long id, StudentDTO std);
	public void deleteStudent(Long id);
}
