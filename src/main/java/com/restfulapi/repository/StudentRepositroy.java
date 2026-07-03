package com.restfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfulapi.entity.Student;

@Repository
public interface StudentRepositroy extends JpaRepository<Student, Long> {

}
