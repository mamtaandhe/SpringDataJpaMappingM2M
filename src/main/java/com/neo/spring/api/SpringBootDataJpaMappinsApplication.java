package com.neo.spring.api;



import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.Module.SetupContext;
import com.neo.spring.api.entity.Course;
import com.neo.spring.api.entity.Student;
import com.neo.spring.api.repository.StudentRepository;

@SpringBootApplication
public class SpringBootDataJpaMappinsApplication implements ApplicationRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaMappinsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
//		Student s1=new Student(1L, "m1");
//		
//		Course c1=new Course(234L,"Java");
//		Course c2=new Course(342L,"C++");
//		
//		
//		Set<Student> students=new HashSet<>();
//		students.add(s1);
//		
//		c1.setStudents(students);
//		c2.setStudents(students);
//		
//		Set<Course> courses=new  HashSet<>();
//		courses.add(c1);
//		courses.add(c2);
//		
//		s1.setCourses(courses);
//		studentRepository.save(s1);
//		
//		
//		Student s2=new Student(2L, "m2");
//		students.add(s2);
//		
//		s2.setCourses(courses);
//		
//		studentRepository.save(s2);
//	
		
		
		List<Student> Students = studentRepository.findByCourses_CourseName("Java");
		for (Student student : Students) {
			System.out.println(student);
		}
		
	}

}
