package com.neo.spring.api.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	@Id
	Long id;
	
	@Column(name = "course_name")
	String courseName;
	
	@ManyToMany(mappedBy = "courses",fetch = FetchType.EAGER)
	Set<Student> students=new HashSet<>();
	
	public Course() {

	}

	public Course(Long id, String courseName) {
		super();
		this.id = id;
		this.courseName = courseName;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
	
	
}
