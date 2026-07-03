package com.restfulapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulapi.dto.StudentDTO;
import com.restfulapi.entity.Student;
import com.restfulapi.exception.ResourceNotFoundException;
import com.restfulapi.repository.StudentRepositroy;
import com.restfulapi.service.StudnetService;

@Service
public class StudentServiceImpl implements StudnetService {

	@Autowired
	private StudentRepositroy repo;
	
	@Override
	public Student createStudent(StudentDTO std) {
		Student s = new Student();
		s.setName(std.getName());
		s.setEmail(std.getEmail());
		s.setMobNum(std.getMobNum());
		s.setBloodGroup(std.getBloodGroup());
		s.setAddress(std.getAddress());
		
		return repo.save(s);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return repo.findAll();
	}

	@Override
	public Student updateStudent(Long id, StudentDTO std) {
		
		Student s = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student Not found"));
		s.setName(std.getName());
		s.setEmail(std.getEmail());
		s.setMobNum(std.getMobNum());
		s.setBloodGroup(std.getBloodGroup());
		s.setAddress(std.getAddress());
		
		return repo.save(s);
	}

	@Override
	public void deleteStudent(Long id) {
		if(!repo.existsById(id)) 
				throw new ResourceNotFoundException("cannot Delete: Not found");
		repo.deleteById(id);
	}

	
}
