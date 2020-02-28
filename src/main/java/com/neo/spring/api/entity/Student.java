package com.neo.spring.api.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	Long id;

	@Column(name = "student_name")
	String studentName;

	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "student_course",
	joinColumns=@JoinColumn(name="student_id"),
	inverseJoinColumns = @JoinColumn(name="course_id"))
	Set<Course> courses=new HashSet<>();
	
	
	public Student() {

	}

	public Student(Long id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", courses=" + courses + "]";
	}
	
	
	
}
