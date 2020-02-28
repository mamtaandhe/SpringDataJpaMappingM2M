package com.neo.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.spring.api.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
