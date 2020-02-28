package com.neo.spring.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.spring.api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findByCourses_CourseName(String courseName);
}
